package code_1;

import java.io.*;

public class File_1 {

        public File_1( String dir) throws IOException
        {
            this.f = new File(dir);
            this.f__ = new FileInputStream(f);
            this.FileSz = f__.available();
            this.fr = new FileReader(f);
            this.temp = new File("temp.txt");
            this.f_1 = new FileOutputStream(this.temp);
        }
        
        private void Rewind ( String str )throws IOException {switch(str){case "inputstream":this.f__.close();break;
        case  "filereader":this.fr.close();this.fr = new FileReader(this.f);break;}}
        
        public boolean searchID( int ID ){return false;}
        
        public int getIndexLine( int lineNum ) throws IOException
        {
            this.Rewind("inputstream");
            int x=0, c, counter=1;
            while( (c = this.f__.read())!= -1 )
            {
                if( lineNum == counter ){return (x);}
                if( c == '\n' ){counter++;}x++;}
        return (-1);}
        
        public int LINES() throws IOException{this.setFileToChars();int x;int c = 0;int counter=0;
            this.MaxLine = 0;for(int i=0;i<FileSz;i++){counter++;if(this.s[i] == '\n'){c++;
            if( this.MaxLine < counter ){ this.MaxLine = counter; }counter = 0;}}this.NumOfLines = c;return c;}
        
        public void setFileToChars() throws IOException{s = new char[this.FileSz];this.fr.read(s,0,FileSz);
        int y =1;
        System.out.print(y+" - ");y++;
        for(int ss:s){
            
            System.out.print((char)ss);
            if(ss == '\n')
            {
                System.out.print(y+" - ");y++;
            }
        }
        }
        
        public void copyEdit( int x ) throws IOException
        {
            int y=0;
            for(int i = 0;i<this.FileSz;i++)
            {
                if(s[i] == '\n'){y++;}
                if(s[i] == '\n' && x==y){continue;}
                if(x-1==y){continue;}
                f_1.write((int)s[i]);
            }
            f__.close();
            f.delete();
            temp.renameTo(f);
        }
        
        private  File f;
        private  InputStream f__;
        private int FileSz;
        private OutputStream f_1;
        private  FileReader fr;
        private char []s;
        private int numOfRows;
        private int MaxLine;
        private int NumOfLines;      
        private File temp;
}