package gj1;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import er1.C58739j4;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: gj1.a */
public final class C32462a {

    /* renamed from: a */
    public static final C32462a f86251a = new C32462a();

    /* renamed from: b */
    public static long f86252b;

    /* renamed from: c */
    public static ArrayList<C59466b> f86253c = new ArrayList<>();

    /* renamed from: d */
    public static final C13601g f86254d = C36568h.m40985a(C32463a.f86257d);

    /* renamed from: e */
    public static final String f86255e = "FinderMagicLiveCardTestConfigKey";

    /* renamed from: f */
    public static boolean f86256f;

    /* renamed from: gj1.a$a */
    public static final class C32463a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C32463a f86257d = new C32463a();

        public C32463a() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV("FinderMagicLiveCardTestConfig");
        }
    }

    /* renamed from: a */
    public final String mo58638a() {
        String str;
        String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_finder_live_game_dynamic_frame_set_data, "");
        Log.m105925i("Finder.FinderLiveFrameSetDataLoader", "exptGameFrameSetData:%s", Y60);
        if (TextUtils.isEmpty(Y60)) {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("id", "portrait_game_ai_interpreter");
            jSONObject.putOpt("parentId", "game_player_frame_set_container");
            jSONObject.putOpt("portrait", 1);
            jSONObject.putOpt("bit", 0);
            jSONObject.putOpt("marginRight", 12);
            jSONObject.putOpt("marginBottom", 4);
            jSONObject.putOpt("width", 84);
            jSONObject.putOpt("height", 20);
            jSONObject.putOpt("alignParentRight", 1);
            jSONObject.putOpt("alignParentBottom", 1);
            JSONObject jSONObject2 = new JSONObject();
            str = "";
            jSONObject2.putOpt("id", "landscape_game_bottom_right");
            jSONObject2.putOpt("parentId", "game_player_frame_set_container");
            jSONObject2.putOpt("landscape", 1);
            jSONObject2.putOpt("clearScreen", 1);
            jSONObject2.putOpt("bit", 3);
            jSONObject2.putOpt("marginRight", 24);
            jSONObject2.putOpt("marginBottom", 90);
            jSONObject2.putOpt("width", 136);
            jSONObject2.putOpt("height", 115);
            jSONObject2.putOpt("alignParentRight", 1);
            jSONObject2.putOpt("alignParentBottom", 1);
            jSONArray.put(jSONObject);
            jSONArray.put(jSONObject2);
            Log.m105925i("Finder.FinderLiveFrameSetDataLoader", "loadDefaultConfig:%s", jSONArray.toString());
            Y60 = jSONArray.toString();
            C87412m.m108593f(Y60, "arrayJSONObject.toString()");
        } else {
            str = "";
        }
        if (C58739j4.f168176a.mo83692U()) {
            String decodeString = ((MultiProcessMMKV) ((C36570n) f86254d).getValue()).decodeString(f86255e, str);
            C87412m.m108593f(decodeString, "debugModeStr");
            if (!(decodeString.length() == 0)) {
                f86256f = true;
                Log.m105924i("Finder.FinderLiveFrameSetDataLoader", "debugMode exptGameFrameSetData not null:" + decodeString);
                Y60 = decodeString;
            } else {
                Log.m105924i("Finder.FinderLiveFrameSetDataLoader", "debugMode exptGameFrameSetData null");
            }
        }
        C87412m.m108593f(Y60, "exptGameFrameSetData");
        return Y60;
    }
}
