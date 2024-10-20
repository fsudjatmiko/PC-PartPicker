public class Pick {
    public String cpu(char x, int budget){
        String cpu = "";
        if  (x == 'a'){
            if  (budget <= 100){
                cpu = "Ryzen 3 1200";
            }
            else if (budget <= 200){
                cpu = "Ryzen 3 3200G";
            }
            else if (budget <= 300){
                cpu = "Ryzen 5 5600G";
            }
            else if (budget <= 500){
                cpu = "Ryzen 5 5600";
            }
            else if (budget <= 1000){
                cpu = "Ryzen 5 7600";
            }
            else if (budget <= 1500){
                cpu = "Ryzen 7 5800X3D";
            }
            else {
                cpu = "Ryzen 9 7950X3D";
            }
        }
        else if (x == 'i'){
            if  (budget <= 100){
                cpu = "Core i3 10100";
            }
            else if (budget <= 200){
                cpu = "Core i3 12100";
            }
            else if (budget <= 300){
                cpu = "Core i5 11400";
            }
            else if (budget <= 500){
                cpu = "Core i5 11400F";
            }
            else if (budget <= 1000){
                cpu = "Core i5 13400KF";
            }
            else if (budget <= 1500){
                cpu = "Core i7 13700KF";
            }
            else {
                cpu = "Core i9 13900K";
            }
        }
        return cpu;
    }

    public String gpu(char x, int budget){
        String cpu = "";
        if  (x == 'n'){
            if  (budget <= 100){
                cpu = "NO GPU";
            }
            else if (budget <= 200){
                cpu = "NO GPU";
            }
            else if (budget <= 300){
                cpu = "NO GPU";
            }
            else if (budget <= 500){
                cpu = "RTX 3050";
            }
            else if (budget <= 1000){
                cpu = "RTX 4060";
            }
            else if (budget <= 1500){
                cpu = "RTX 4070 TI";
            }
            else {
                cpu = "RTX 4090";
            }
        }
        else if (x == 'a'){
            if  (budget <= 100){
                cpu = "NO GPU";
            }
            else if (budget <= 200){
                cpu = "NO GPU";
            }
            else if (budget <= 300){
                cpu = "NO GPU";
            }
            else if (budget <= 500){
                cpu = "RX 6500";
            }
            else if (budget <= 1000){
                cpu = "RX 6600XT";
            }
            else if (budget <= 1500){
                cpu = "RX 7700XT";
            }
            else {
                cpu = "RX 7900XTX";
            }
        }
        return cpu;
    }
}
