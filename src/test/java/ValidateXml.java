import java.io.IOException;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Copyright 2016 Zhongan.com All right reserved. This software is the
 * confidential and proprietary information of Zhongan.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Zhongan.com.
 */
/**
 * 类ValidateXml.java的实现描述：TODO 类实现描述
 * 
 * @author wangding_91@163.com 2016年2月2日 下午2:08:54
 */
public class ValidateXml {

    @Test
    public void validate() throws IOException {
        //        Resource rs = new ClassPathResource("healthPolicy.jpdl.xml");
        //        XmlValidationModeDetector xsd = new XmlValidationModeDetector();
        //        InputStream is = rs.getInputStream();
        //        //        xsd.detectValidationMode(is);
        //        //        InputStreamReader isr = new InputStreamReader(is, "UTF-8");
        //        //        String str = "";
        //        //        int tmp = 0;
        //        //        while ((tmp = isr.read()) != -1) {
        //        //            str += (char) tmp;
        //        //        }
        //        //        System.out.println(str);
        //        System.out.println(xsd.detectValidationMode(is));
        new ClassPathXmlApplicationContext("healthPolicy.xml");
        //        new ClassPathXmlApplicationContext("/biz/applicationContext.xml");

        //        String xmlFileName = "E:\\selfworkspace\\DruidWeb\\src\\main\\resources\\healthPolicy.xml";
        //        //        String xsdFileName = "E:\\selfworkspace\\DruidWeb\\src\\main\\java\\com\\dingwang\\spring\\parser\\config\\process.xsd";
        //        String xsdFileName = "";
        //        String path = System.getProperty("user.dir");
        //        System.out.println("path=" + path);
        //        xsdFileName = path + File.separator + "src" + File.separator + "main" + File.separator + "resources"
        //                + File.separator + "config" + File.separator + "process.xsd";
        //        System.out.println("xsdFileName=" + xsdFileName);
        //        try {
        //            //创建默认的XML错误处理器 
        //            XMLErrorHandler errorHandler = new XMLErrorHandler();
        //            //获取基于 SAX 的解析器的实例 
        //            SAXParserFactory factory = SAXParserFactory.newInstance();
        //            //解析器在解析时验证 XML 内容。 
        //            factory.setValidating(true);
        //            //指定由此代码生成的解析器将提供对 XML 名称空间的支持。 
        //            factory.setNamespaceAware(true);
        //            //使用当前配置的工厂参数创建 SAXParser 的一个新实例。 
        //            SAXParser parser = factory.newSAXParser();
        //            //创建一个读取工具 
        //            SAXReader xmlReader = new SAXReader();
        //            //获取要校验xml文档实例 
        //            Document xmlDocument = (Document) xmlReader.read(new File(xmlFileName));
        //            //设置 XMLReader 的基础实现中的特定属性。核心功能和属性列表可以在 [url]http://sax.sourceforge.net/?selected=get-set[/url] 中找到。 
        //            parser.setProperty("http://java.sun.com/xml/jaxp/properties/schemaLanguage",
        //                    "http://www.w3.org/2001/XMLSchema");
        //            parser.setProperty("http://java.sun.com/xml/jaxp/properties/schemaSource", "file:" + xsdFileName);
        //            //创建一个SAXValidator校验工具，并设置校验工具的属性 
        //            SAXValidator validator = new SAXValidator(parser.getXMLReader());
        //            //设置校验工具的错误处理器，当发生错误时，可以从处理器对象中得到错误信息。 
        //            validator.setErrorHandler(errorHandler);
        //            //校验 
        //            validator.validate(xmlDocument);
        //
        //            XMLWriter writer = new XMLWriter(OutputFormat.createPrettyPrint());
        //            //如果错误信息不为空，说明校验失败，打印错误信息 
        //            if (errorHandler.getErrors().hasContent()) {
        //                System.out.println("XML文件通过XSD文件校验失败！");
        //                writer.write(errorHandler.getErrors());
        //            } else {
        //                System.out.println("Good! XML文件通过XSD文件校验成功！");
        //            }
        //        } catch (Exception ex) {
        //            System.out.println("XML文件: " + xmlFileName + " 通过XSD文件:" + xsdFileName + "检验失败。\n原因： " + ex.getMessage());
        //            ex.printStackTrace();
        //        }
    }

}
