-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 2017-03-22 15:53:55
-- 服务器版本： 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `jfinal_wz369`
--

-- --------------------------------------------------------

--
-- 表的结构 `blog`
--

CREATE TABLE `blog` (
  `id` int(11) NOT NULL,
  `title` varchar(200) DEFAULT NULL,
  `content` mediumtext NOT NULL,
  `postlocation` mediumtext,
  `visibility` int(11) DEFAULT NULL,
  `usrid` int(11) DEFAULT NULL,
  `usrname` varchar(50) DEFAULT NULL,
  `time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `blog`
--

INSERT INTO `blog` (`id`, `title`, `content`, `postlocation`, `visibility`, `usrid`, `usrname`, `time`) VALUES
(1, NULL, '我是真的是这样说的啥时候回来吧', '北京市朝阳区', 2, NULL, NULL, NULL),
(2, NULL, '我要去看电影', '', 2, NULL, NULL, NULL),
(3, NULL, '我要睡觉了么事干活累计涨幅', '北京市朝阳区', 2, NULL, NULL, NULL),
(4, NULL, '我的世界杯具备胎盘点表情包括', '', 1, NULL, NULL, NULL),
(5, NULL, '我也不知道怎么回事了', '北京市朝阳区', 1, NULL, NULL, NULL),
(6, NULL, '我是一个人在家里', '', 1, NULL, NULL, NULL),
(7, NULL, '我的电脑桌面游戏中国银行卡通人物', '', 1, NULL, NULL, NULL),
(8, NULL, '我要睡觉了', '', 1, NULL, NULL, NULL),
(9, NULL, '我的', '', 1, NULL, NULL, NULL),
(10, NULL, '我的世界', '北京市朝阳区', 1, NULL, NULL, NULL),
(11, NULL, '我的世界', '', 1, NULL, NULL, NULL),
(12, NULL, '我的世界', '北京市朝阳区', 1, NULL, NULL, NULL),
(13, NULL, '用的时候', '北京市朝阳区', 1, NULL, NULL, NULL),
(14, NULL, '我的世界杯茶楼', '', 1, NULL, '路易工匠001', '2017-03-22 00:00:00'),
(15, NULL, '没事干嘛呢', '', 1, NULL, '路易工匠001', '2017-03-22 00:00:00'),
(16, NULL, '我的世界我的手机号码', '', 1, NULL, '路易工匠001', '2017-03-22 00:00:00'),
(17, NULL, '嗯我也是醉了', '', 1, NULL, '路易工匠001', '2017-03-22 01:19:15'),
(18, NULL, '我的电脑前两天假期', '', 1, NULL, '路易工匠001', '2017-03-22 01:29:20'),
(19, NULL, '我的手机没电了', '', 1, NULL, '路易工匠001', '2017-03-22 01:29:45');

-- --------------------------------------------------------

--
-- 表的结构 `image`
--

CREATE TABLE `image` (
  `path` text,
  `type` text,
  `idx` int(11) DEFAULT NULL,
  `id` int(11) NOT NULL,
  `blogid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- 转存表中的数据 `image`
--

INSERT INTO `image` (`path`, `type`, `idx`, `id`, `blogid`) VALUES
('F:\\dev\\jfinal\\jfinal_demo\\WebRoot\\upload', 'image/jpeg', NULL, 1, 3),
('F:\\dev\\jfinal\\jfinal_demo\\WebRoot\\upload', 'image/jpeg', NULL, 2, 3),
('F:\\dev\\jfinal\\jfinal_demo\\WebRoot\\upload', 'image/jpeg', NULL, 3, 3),
('F:\\dev\\jfinal\\jfinal_demo\\WebRoot\\upload', 'image/jpeg', NULL, 4, 4),
('F:\\dev\\jfinal\\jfinal_demo\\WebRoot\\upload', 'image/jpeg', NULL, 5, 4),
('F:\\dev\\jfinal\\jfinal_demo\\WebRoot\\upload', 'image/jpeg', NULL, 6, 4),
('F:\\dev\\jfinal\\jfinal_demo\\WebRoot\\upload', 'image/png', NULL, 7, 5),
('F:\\dev\\jfinal\\jfinal_demo\\WebRoot\\upload', 'image/jpeg', NULL, 8, 5),
('F:\\dev\\jfinal\\jfinal_demo\\WebRoot\\upload', 'image/jpeg', NULL, 9, 5),
('F:\\dev\\jfinal\\jfinal_demo\\WebRoot\\upload', 'image/png', NULL, 10, 6),
('F:\\dev\\jfinal\\jfinal_demo\\WebRoot\\upload', 'image/jpeg', NULL, 11, 6),
('F:\\dev\\jfinal\\jfinal_demo\\WebRoot\\upload', 'image/jpeg', NULL, 12, 6),
('file:/F:/dev/jfinal/jfinal_demo/WebRoot/upload/201703220007263098dd3a73cdb0efa7ea0745c157dceeda9.jpg', 'image/jpeg', 0, 13, 7),
('file:/F:/dev/jfinal/jfinal_demo/WebRoot/upload/201703220007264127acbeb068783bc05a53cecf18ecbead6.jpg', 'image/jpeg', 1, 14, 7),
('file:/F:/dev/jfinal/jfinal_demo/WebRoot/upload/20170322000726464lysh_shot001.jpg1490112139344.jpg', 'image/jpeg', 2, 15, 7),
('20170322002239043b23698c8-7d50-4a56-9da1-0bd3e0e562a25.jpeg', 'image/jpeg', 0, 16, 8),
('20170322002534750xiaokatv14895687990313.jpg', 'image/jpeg', 0, 17, 9),
('20170322002708562Screenshot_2017-02-21-20-43-15-343.png', 'image/png', 0, 18, 10),
('20170322004520921518f04b13c72f6ea2157f01b55dde90c2.jpg', 'image/jpeg', 0, 19, 11);

-- --------------------------------------------------------

--
-- 表的结构 `session`
--

CREATE TABLE `session` (
  `id` int(11) NOT NULL,
  `session` varchar(45) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  `expiretime` datetime DEFAULT NULL,
  `oauthtype` varchar(10) DEFAULT NULL,
  `active` tinyint(4) DEFAULT NULL,
  `updatetime` datetime DEFAULT NULL,
  `discard` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- 表的结构 `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `nickname` varchar(50) DEFAULT NULL,
  `iconurl` varchar(50) DEFAULT NULL,
  `qq` varchar(20) DEFAULT NULL,
  `weixin` varchar(20) DEFAULT NULL,
  `weibo` varchar(50) DEFAULT NULL,
  `district` varchar(50) DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  `updatetime` datetime DEFAULT NULL,
  `discard` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- 表的结构 `userinfo`
--

CREATE TABLE `userinfo` (
  `id` int(11) NOT NULL,
  `userinfo` varchar(200) DEFAULT NULL,
  `oauthtype` varchar(10) DEFAULT NULL,
  `sessionid` int(11) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  `updatetime` datetime DEFAULT NULL,
  `discard` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `blog`
--
ALTER TABLE `blog`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `image`
--
ALTER TABLE `image`
  ADD PRIMARY KEY (`id`),
  ADD KEY `blogid` (`blogid`);

--
-- Indexes for table `session`
--
ALTER TABLE `session`
  ADD PRIMARY KEY (`id`),
  ADD KEY `userid_idx` (`userid`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `iduser_UNIQUE` (`id`),
  ADD UNIQUE KEY `username_UNIQUE` (`username`);

--
-- Indexes for table `userinfo`
--
ALTER TABLE `userinfo`
  ADD PRIMARY KEY (`id`),
  ADD KEY `sessionid_idx` (`sessionid`),
  ADD KEY `userid1_idx` (`userid`);

--
-- 在导出的表使用AUTO_INCREMENT
--

--
-- 使用表AUTO_INCREMENT `blog`
--
ALTER TABLE `blog`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
--
-- 使用表AUTO_INCREMENT `image`
--
ALTER TABLE `image`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
--
-- 使用表AUTO_INCREMENT `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- 限制导出的表
--

--
-- 限制表 `image`
--
ALTER TABLE `image`
  ADD CONSTRAINT `blogid` FOREIGN KEY (`blogid`) REFERENCES `blog` (`id`);

--
-- 限制表 `session`
--
ALTER TABLE `session`
  ADD CONSTRAINT `userid` FOREIGN KEY (`userid`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- 限制表 `userinfo`
--
ALTER TABLE `userinfo`
  ADD CONSTRAINT `sessionid` FOREIGN KEY (`sessionid`) REFERENCES `session` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `userid1` FOREIGN KEY (`userid`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
