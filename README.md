## 简介
本项目实现一个全局唯一id生成器。
适配了各种全局id生成方案

## 设计
- 用户角度
对于想要使用id生成器的开发人员来说，他想要生成器有哪些特性？
硬性要求：

高性能、高可用、高并发


软性要求：
用户可以选择对应的id生成规则（例如主流的雪花算法）
用户可以在id序列中加入自定义属性（例如加入商品的序列信息）

## 架构图


