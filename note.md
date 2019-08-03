1. 把背景音乐放在out sample目录里面
2. 把图片分别放在out和src下面
3. 多次打包出现：
F:/InterlliJ IDEA/Demo/src/main/java/META-INF/MANIFEST.MF' 
already exists in VFS

删除src/META-INFO下面的文件

如何制作一个文件夹可以打包发给对方？
1.创建一个文件夹javaFX
2.把jdk复制到这个文件夹
3. 打包程序为jar包：
File--Project Structure--Artifacts--jar--from dependencies
--选择Main--ok--ok
Build--build Artifacts--项目名--build
把jar包复制到javaFX

4把java.bat和start.vbs复制到javaFX

双击java.bat可以执行jar，但是先要弹出cmd,start.vbs:禁止弹出cmd