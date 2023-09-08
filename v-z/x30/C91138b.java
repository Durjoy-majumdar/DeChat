package x30;

import com.tencent.p014mm.kara.localfewshotlearning.xgb.XGBoost;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.json.JSONObject;

/* renamed from: x30.b */
public class C91138b extends C91137a {

    /* renamed from: a */
    public String f261355a;

    /* renamed from: b */
    public long f261356b;

    /* renamed from: c */
    public double f261357c;

    public C91138b(String str) {
        this.f261355a = str;
    }

    /* renamed from: a */
    public boolean mo125207a() {
        this.f261356b = XGBoost.initModel(this.f261355a);
        File file = new File(this.f261355a);
        double d = 0.5d;
        if (file.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
                bufferedReader.close();
                d = new JSONObject(sb.toString()).getDouble("predict_threshold");
            } catch (Exception unused) {
            }
        }
        this.f261357c = d;
        XGBoost.m98815a(this.f261355a);
        return this.f261356b > 0;
    }
}
