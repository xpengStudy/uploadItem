# 将本地项目上传至GitHub上

## 以下为详细步骤  （默认为已有git 账号，并在本地已安装部署好了git）

### 一、在githup 上创建对应的文件仓库 ，并copy 对应仓库的 SSH 地址备用
> copy 备用 git remote add origin git@github.com:xpengStudy/uploadItem.git
### 二、初始化本地 ##项目文件夹##
> 进入项目文件夹中  cd / 项目文件夹中 ，输入以下命令
```git 
      git init 
```
### 三、将本地项目文件加入提交列表
``` git  
    git add .  （注意 . 不能忘了 . 代表所有文件）
```
### 四、提交项目文件 
``` git
    git commit -m "first commit"”  
```
### 五、连接githup 仓库
```git
   git remote add origin git@github.com:xpengStudy/uploadItem.git 
```
### 六、上传项目至githup
```git
   git push -u origin master
```
### 七、刷新githup，查看是否上传成功
