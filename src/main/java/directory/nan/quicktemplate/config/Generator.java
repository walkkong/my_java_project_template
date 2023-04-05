package directory.nan.quicktemplate.config;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.TemplateType;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.nio.file.Paths;
import java.util.Collections;

/**
 * 生成 entity、mapper、service
 * @author liyanan
 * @date 2023/04/05 14:46
 **/
public class Generator {
    public static String outPutPath = Paths.get("").toAbsolutePath().toString() + "/src/main/java";

    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/my_test?useUnicode=true&characterEncoding=utf8&autoReconnect=true&useSSL=false&serverTimezone=UTC",
                        "root", "L051228n!")
                .globalConfig(builder -> {
                    builder.author("nan")
                            .outputDir(outPutPath)
                            .dateType(DateType.ONLY_DATE);
                })
                .packageConfig(builder -> {
                    builder.parent("directory.nan")
                            .moduleName("quicktemplate")
                            .serviceImpl("service")
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "src/main/resources/auto_generate/mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("user");
                    builder.entityBuilder().enableFileOverride();
                    builder.mapperBuilder().enableBaseResultMap().enableBaseColumnList();
                })
                .templateConfig(builder -> builder.disable(TemplateType.CONTROLLER))
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
