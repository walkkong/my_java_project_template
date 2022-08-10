CREATE TABLE `vendors` (
  `vend_id` char(10) NOT NULL,
  `vend_name` char(50) NOT NULL,
  `vend_address` char(50) DEFAULT NULL,
  `vend_city` char(50) DEFAULT NULL,
  `vend_state` char(5) DEFAULT NULL,
  `vend_zip` char(10) DEFAULT NULL,
  `vend_country` char(50) DEFAULT NULL,
  `vend_web` char(200) DEFAULT NULL,
  PRIMARY KEY (`vend_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `order_system`.`vendors`(`vend_id`, `vend_name`, `vend_address`, `vend_city`, `vend_state`, `vend_zip`, `vend_country`, `vend_web`) VALUES ('3444', 'dsadadadsa', 'dsadadadsa', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `order_system`.`vendors`(`vend_id`, `vend_name`, `vend_address`, `vend_city`, `vend_state`, `vend_zip`, `vend_country`, `vend_web`) VALUES ('BRE02', 'Bear Emporium', '500 PARK STREET', 'Anytown', 'OH', '44333', 'USA', 'dakjhdsahdk');
INSERT INTO `order_system`.`vendors`(`vend_id`, `vend_name`, `vend_address`, `vend_city`, `vend_state`, `vend_zip`, `vend_country`, `vend_web`) VALUES ('BRS01', 'Bears R Us', '123 MAIN STREET', 'Bear Town', 'MI', '44444', 'USA', 'dakjhdsahdk');