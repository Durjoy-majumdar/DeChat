package gj1;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import java.util.ArrayList;
import kg3.C76577a;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: gj1.b */
public final class C59466b {

    /* renamed from: A */
    public String f169906A = "";

    /* renamed from: B */
    public String f169907B = "";

    /* renamed from: C */
    public String f169908C = "";

    /* renamed from: D */
    public String f169909D = "";

    /* renamed from: E */
    public String f169910E = "";

    /* renamed from: a */
    public String f169911a;

    /* renamed from: b */
    public String f169912b;

    /* renamed from: c */
    public boolean f169913c;

    /* renamed from: d */
    public boolean f169914d;

    /* renamed from: e */
    public boolean f169915e = true;

    /* renamed from: f */
    public int f169916f;

    /* renamed from: g */
    public int f169917g;

    /* renamed from: h */
    public int f169918h;

    /* renamed from: i */
    public int f169919i;

    /* renamed from: j */
    public int f169920j;

    /* renamed from: k */
    public int f169921k;

    /* renamed from: l */
    public int f169922l;

    /* renamed from: m */
    public boolean f169923m;

    /* renamed from: n */
    public boolean f169924n;

    /* renamed from: o */
    public boolean f169925o;

    /* renamed from: p */
    public boolean f169926p;

    /* renamed from: q */
    public boolean f169927q;

    /* renamed from: r */
    public boolean f169928r;

    /* renamed from: s */
    public boolean f169929s;

    /* renamed from: t */
    public boolean f169930t;

    /* renamed from: u */
    public boolean f169931u;

    /* renamed from: v */
    public String f169932v = "";

    /* renamed from: w */
    public String f169933w = "";

    /* renamed from: x */
    public String f169934x = "";

    /* renamed from: y */
    public String f169935y = "";

    /* renamed from: z */
    public String f169936z = "";

    /* renamed from: gj1.b$a */
    public static final class C59467a {

        /* renamed from: a */
        public static final C59467a f169937a = new C59467a();

        /* renamed from: a */
        public final ArrayList<C59466b> mo84568a(String str) {
            ArrayList<C59466b> arrayList = new ArrayList<>();
            if (TextUtils.isEmpty(str)) {
                Log.m105920e("Finder.FinderLiveFrameSetLayoutParam", "paramJson is empty");
                return arrayList;
            }
            Log.m105925i("Finder.FinderLiveFrameSetLayoutParam", "parseFrameSetParam:%s", str);
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() == 0) {
                    return arrayList;
                }
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    C59466b bVar = new C59466b();
                    bVar.f169911a = jSONObject.getString("id");
                    bVar.f169912b = jSONObject.getString("parentId");
                    bVar.f169913c = jSONObject.optInt("portrait", 0) == 1;
                    bVar.f169914d = jSONObject.optInt("landscape", 0) == 1;
                    bVar.f169915e = jSONObject.optInt("clearScreen", 0) == 1;
                    bVar.f169916f = (int) Math.pow(2.0d, (double) jSONObject.optInt("bit", 0));
                    bVar.f169917g = C76577a.m92151b(MMApplicationContext.getContext(), jSONObject.optInt("marginTop", 0));
                    bVar.f169918h = C76577a.m92151b(MMApplicationContext.getContext(), jSONObject.optInt("marginLeft", 0));
                    bVar.f169919i = C76577a.m92151b(MMApplicationContext.getContext(), jSONObject.optInt("marginRight", 0));
                    bVar.f169920j = C76577a.m92151b(MMApplicationContext.getContext(), jSONObject.optInt("marginBottom", 0));
                    int optInt = jSONObject.optInt("width", 0);
                    int optInt2 = jSONObject.optInt("height", 0);
                    if (optInt >= 0) {
                        bVar.f169921k = C76577a.m92151b(MMApplicationContext.getContext(), optInt);
                    } else {
                        bVar.f169921k = optInt;
                    }
                    if (optInt2 >= 0) {
                        bVar.f169922l = C76577a.m92151b(MMApplicationContext.getContext(), optInt2);
                    } else {
                        bVar.f169922l = optInt2;
                    }
                    bVar.f169923m = jSONObject.optInt("alignParentTop", 0) == 1;
                    bVar.f169924n = jSONObject.optInt("alignParentLeft", 0) == 1;
                    bVar.f169925o = jSONObject.optInt("alignParentRight", 0) == 1;
                    bVar.f169926p = jSONObject.optInt("alignParentBottom", 0) == 1;
                    bVar.f169927q = jSONObject.optInt("alignParentStart", 0) == 1;
                    bVar.f169928r = jSONObject.optInt("alignParentEnd", 0) == 1;
                    bVar.f169929s = jSONObject.optInt("centerInParent", 0) == 1;
                    bVar.f169930t = jSONObject.optInt("centerHorizontal", 0) == 1;
                    bVar.f169931u = jSONObject.optInt("centerVertical", 0) == 1;
                    int optInt3 = jSONObject.optInt("alignWithParentIfMissing", 0);
                    String optString = jSONObject.optString("alignTop");
                    C87412m.m108593f(optString, "paramObj.optString(\"alignTop\")");
                    bVar.f169932v = optString;
                    String optString2 = jSONObject.optString("alignBottom");
                    C87412m.m108593f(optString2, "paramObj.optString(\"alignBottom\")");
                    bVar.f169933w = optString2;
                    String optString3 = jSONObject.optString("alignLeft");
                    C87412m.m108593f(optString3, "paramObj.optString(\"alignLeft\")");
                    bVar.f169934x = optString3;
                    String optString4 = jSONObject.optString("alignRight");
                    C87412m.m108593f(optString4, "paramObj.optString(\"alignRight\")");
                    bVar.f169935y = optString4;
                    String optString5 = jSONObject.optString("below");
                    C87412m.m108593f(optString5, "paramObj.optString(\"below\")");
                    bVar.f169936z = optString5;
                    String optString6 = jSONObject.optString("above");
                    C87412m.m108593f(optString6, "paramObj.optString(\"above\")");
                    bVar.f169906A = optString6;
                    String optString7 = jSONObject.optString("toLeftOf");
                    C87412m.m108593f(optString7, "paramObj.optString(\"toLeftOf\")");
                    bVar.f169907B = optString7;
                    String optString8 = jSONObject.optString("toRightOf");
                    C87412m.m108593f(optString8, "paramObj.optString(\"toRightOf\")");
                    bVar.f169908C = optString8;
                    String optString9 = jSONObject.optString("toStartOf");
                    C87412m.m108593f(optString9, "paramObj.optString(\"toStartOf\")");
                    bVar.f169909D = optString9;
                    String optString10 = jSONObject.optString("toEndOf");
                    C87412m.m108593f(optString10, "paramObj.optString(\"toEndOf\")");
                    bVar.f169910E = optString10;
                    arrayList.add(bVar);
                }
                return arrayList;
            } catch (Exception e) {
                Log.printErrStackTrace("Finder.FinderLiveFrameSetLayoutParam", e, "parseFrameSetParam", new Object[0]);
            }
        }
    }
}
