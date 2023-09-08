package mi2;

import android.text.TextUtils;
import android.widget.Button;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import dr1.C7473b;
import dr1.C7483i;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import li2.C10531a;
import p256vw.C15013c;
import p256vw.C15016h;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: mi2.d */
public final class C10896d extends C15053a {

    /* renamed from: d */
    public static final C10896d f32520d = new C10896d();

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        int hashCode = jVar.f38998a.hashCode();
        String str = (String) h1Var.f38983a.get("content");
        if (str == null) {
            str = "";
        }
        String str2 = (String) h1Var.f38983a.get("selectedStartIndex");
        String str3 = "0";
        if (str2 == null) {
            str2 = str3;
        }
        String str4 = (String) h1Var.f38983a.get("selectedEndIndex");
        if (str4 != null) {
            str3 = str4;
        }
        int parseInt = Integer.parseInt(str2);
        int parseInt2 = Integer.parseInt(str3);
        Log.m105924i("MicroMsg.JsApiSelectedTextChanged", "JsApi-Call: key:" + hashCode + " select content:" + str + ", selectedStartIndex:" + str2 + ", selectedEndIndex:" + str3);
        C15016h hVar = (C15016h) ((ConcurrentHashMap) C10531a.f31800a).get(Integer.valueOf(hashCode));
        if (hVar != null) {
            hVar.f41143e = str;
            hVar.f41144f = parseInt;
            hVar.f41145g = parseInt2;
            Button button = hVar.f41148j;
            if (button != null) {
                button.setEnabled(!TextUtils.isEmpty(str));
            }
            C15013c cVar = hVar.f41150l;
            if (cVar != null) {
                C7473b bVar = (C7473b) cVar;
                C7483i iVar = bVar.f25691a;
                FinderJumpInfo finderJumpInfo = iVar.f25702c;
                if (finderJumpInfo != null) {
                    finderJumpInfo.wording = str;
                }
                C7483i.m7616c(iVar);
                C7483i iVar2 = bVar.f25691a;
                FinderJumpInfo finderJumpInfo2 = iVar2.f25702c;
                if (finderJumpInfo2 != null) {
                    finderJumpInfo2.wording = iVar2.f25703d;
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return 10004;
    }

    /* renamed from: c */
    public String mo7288c() {
        return "selectedTextChanged";
    }
}
