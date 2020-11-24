 /*此方式共四行代码，文件目录树为
        src/App.java
        src/img/plane0.png
 */
        
        java.net.URL imgURL = App.class.getResource("img/plane0.png");
        label_goodPlane.setIcon(new ImageIcon(imgURL));
        label_goodPlane.setBounds(100,100,128,128);
        myPanel.add(label_goodPlane);
        
        
        
        
  /*此方式共三行代码，文件目录树为
        src/App.java
        src/img/plane0.png
 */     
        label_goodPlane.setIcon(new ImageIcon("src/img/plane0.png"));
        label_goodPlane.setBounds(100,100,128,128);
        myPanel.add(label_goodPlane);
