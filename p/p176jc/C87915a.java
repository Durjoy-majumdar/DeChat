package p176jc;

import com.tencent.skyline.jni.SkylineCronetClientInterface;
import gy3.C87412m;
import java.util.HashMap;

/* renamed from: jc.a */
public final class C87915a implements SkylineCronetClientInterface {
    public void StartCronetHttpTask(int i, String str, HashMap<String, String> hashMap) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(hashMap, "headers");
        C87923f.f254468a.mo122391a(i, str, hashMap);
    }
}
