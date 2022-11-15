/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PWS.C.Idcard;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author acer
 */

@Controller
public class idcard {
    
 
    
    @ResponseBody
    @RequestMapping ("/end")
    public String getData(@RequestParam("nama") String nama,@RequestParam("tgllahir")@DateTimeFormat (pattern="yyyy-MM-dd") Date tanggallahir, @RequestParam("foto") MultipartFile foto) throws IOException, ParseException {
        
        
                
               SimpleDateFormat lampuijo = new SimpleDateFormat("dd-MMMM-yyyy");
               
               String berawan = lampuijo.format(tanggallahir);
 
                
               
                
                
                String story= Base64.encodeBase64String(foto.getBytes());
                
                
                
                
                return "Nama :" + nama + " </br>"+ " </br>"+ " </br>" + " Tanggal Lahir :" + berawan +" </br>"+ " </br>"+ " </br>" + "Foto" +" </br>"+ " </br>" + "<image  'width= 10' src='data:image/jpeg;base64  , "+story+" '></br>";
        }       
    
            
            
        
}
