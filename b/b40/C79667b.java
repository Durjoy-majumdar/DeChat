package b40;

import a40.C79462a;
import com.tencent.p014mm.kara.localfewshotlearning.xgb.XGBoost;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import f30.C86705b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import v30.C90748b;
import x30.C91137a;
import x30.C91138b;
import y30.C91370a;

/* renamed from: b40.b */
public class C79667b extends C79666a {

    /* renamed from: d */
    public Map<String, Integer> f233578d = new HashMap();

    /* renamed from: e */
    public int f233579e = 0;

    /* renamed from: f */
    public boolean f233580f;

    public C79667b(C91370a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public boolean mo109455a() {
        synchronized (this) {
            if (C86013q1.m106450k(C90748b.f260643b) && C90748b.m113818a()) {
                C91138b bVar = new C91138b(this.f233576b.mo125343c());
                this.f233577c = bVar;
                bVar.mo125207a();
            }
        }
        String c = this.f233576b.mo125343c();
        int i = XGBoost.f237798a;
        ArrayList arrayList = new ArrayList();
        File file = new File(c);
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
                JSONArray jSONArray = new JSONObject(sb.toString()).getJSONArray("wechat_feature_names");
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    arrayList.add(jSONArray.get(i2).toString());
                }
            } catch (Exception unused) {
            }
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((HashMap) this.f233578d).put((String) arrayList.get(i3), Integer.valueOf(i3));
        }
        this.f233579e = XGBoost.m98815a(this.f233576b.mo125343c());
        this.f233580f = true;
        return true;
    }

    /* renamed from: b */
    public boolean mo109456b() {
        return this.f233580f;
    }

    /* renamed from: c */
    public C79462a.C79463a mo109457c(C86705b bVar) {
        Map<String, Integer> map = this.f233578d;
        if (map == null || ((HashMap) map).size() == 0) {
            Log.m105920e("Kara.FewShotBinaryClassifyPredict", "features null");
            return null;
        }
        float[] a = bVar.mo121090a(this.f233578d);
        if (this.f233579e != a.length) {
            Log.m105920e("Kara.FewShotBinaryClassifyPredict", "args check error");
            return null;
        }
        C91137a aVar = this.f233577c;
        if (aVar != null) {
            C91138b bVar2 = (C91138b) aVar;
            long j = bVar2.f261356b;
            boolean z = j > 0 && ((double) XGBoost.predictPositive(j, a)) > bVar2.f261357c;
            C79462a.C79463a aVar2 = new C79462a.C79463a(this);
            float f = 0.0f;
            aVar2.mo109460b(0, z ? 0.0f : 1.0f);
            if (z) {
                f = 1.0f;
            }
            aVar2.mo109460b(1, f);
            return aVar2;
        }
        Log.m105920e("Kara.FewShotBinaryClassifyPredict", "predictor null");
        return null;
    }
}
