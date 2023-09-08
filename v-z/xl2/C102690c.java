package xl2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.worddetect.WordDetectNative;
import java.util.ArrayList;
import java.util.List;

/* renamed from: xl2.c */
public class C102690c {

    /* renamed from: a */
    public List<Float> f303305a = new ArrayList();

    public C102690c(WordDetectNative.WordDetectDetailResult wordDetectDetailResult) {
        if (wordDetectDetailResult != null && wordDetectDetailResult.rate_lang != null) {
            for (int i = 0; i < wordDetectDetailResult.rate_lang.length; i++) {
                Log.m105925i("MicroMsg.WordDetectDetailResultWrapper", "%d ratio %f", Integer.valueOf(i), Float.valueOf(wordDetectDetailResult.rate_lang[i]));
                this.f303305a.add(Float.valueOf(wordDetectDetailResult.rate_lang[i]));
            }
        }
    }
}
