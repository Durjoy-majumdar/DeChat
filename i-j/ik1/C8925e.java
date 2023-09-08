package ik1;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import hg1.C8528e;
import ig1.C8916d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p170ic.C87689c;
import p749xh.C38596k3;
import rx3.C13598b0;

/* renamed from: ik1.e */
public final class C8925e extends C8528e {

    /* renamed from: e */
    public final ISQLiteDatabase f28231e;

    /* renamed from: ik1.e$a */
    public static final class C8926a extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LinkedList<String> f28232d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8926a(LinkedList<String> linkedList) {
            super(1);
            this.f28232d = linkedList;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "id");
            this.f28232d.add(str);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8925e(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C8916d.f28212c1, "FinderLiveGiftInfo", C38596k3.f102774I);
        C87412m.m108594g(iSQLiteDatabase, "db");
        C8916d.C8917a aVar = C8916d.f28211b1;
        this.f28231e = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public LinkedHashMap<String, List<String>> mo9739Lo() {
        try {
            LinkedHashMap<String, List<String>> linkedHashMap = new LinkedHashMap<>();
            JSONObject jSONObject = new JSONObject(C86709a0.m107535s().mo121142i().mo119675I(C72994y1.C72995a.USERINFO_FINDER_LIVE_GIFT_TAB_INFO_STRING_SYNC, ""));
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                LinkedList linkedList = new LinkedList();
                JSONArray optJSONArray = jSONObject.optJSONArray(next);
                if (optJSONArray != null) {
                    C87689c.m109089b(optJSONArray, new C8926a(linkedList));
                }
                C87412m.m108593f(next, "key");
                linkedHashMap.put(next, linkedList);
            }
            return linkedHashMap;
        } catch (JSONException e) {
            Log.m105924i("Finder.FinderLiveGiftStorage", "[getLiveGiftTabInfo] e:" + e.getMessage());
            return null;
        }
    }

    /* renamed from: jo */
    public List<C8916d> mo9740jo() {
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = this.f28231e.rawQuery("SELECT * FROM FinderLiveGiftInfo order by FinderLiveGiftInfo.giftIndex asc", (String[]) null, 2);
        while (rawQuery.moveToNext()) {
            C8916d dVar = new C8916d();
            dVar.convertFrom(rawQuery);
            arrayList.add(dVar);
        }
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: qq */
    public int mo9741qq(C8916d dVar) {
        C87412m.m108594g(dVar, "giftInfo");
        int replace = (int) this.f28231e.replace("FinderLiveGiftInfo", "rewardProductId", dVar.convertTo());
        Log.m105924i("Finder.FinderLiveGiftStorage", "insert gift " + dVar + ' ' + replace);
        return replace;
    }
}
