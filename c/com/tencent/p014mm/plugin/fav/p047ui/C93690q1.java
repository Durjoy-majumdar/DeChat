package com.tencent.p014mm.plugin.fav.p047ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import com.tencent.p014mm.p136ui.widget.snackbar.C75018a;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gy3.C87412m;
import java.util.Arrays;
import java.util.LinkedList;
import kg3.C76577a;
import org.json.JSONArray;
import org.json.JSONObject;
import pb1.C100718j1;
import pb1.C100734q;
import pb1.C100755z;
import pb1.C47450f1;
import te3.C101756ae0;
import te3.C101801kd0;
import te3.C52097yc0;
import xb1.C102614d;

@C86522b
/* renamed from: com.tencent.mm.plugin.fav.ui.q1 */
public final class C93690q1 extends C86301e implements C47450f1 {

    /* renamed from: com.tencent.mm.plugin.fav.ui.q1$a */
    public static final class C93691a implements C75018a.C75024d {

        /* renamed from: a */
        public static final C93691a f270487a = new C93691a();

        /* renamed from: a */
        public final void mo7429a() {
            FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
            favoriteOperationEvent.f264833d.f264835a = 35;
            favoriteOperationEvent.publish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.q1$b */
    public static final class C93692b implements C75018a.C75024d {

        /* renamed from: a */
        public final /* synthetic */ long f270488a;

        /* renamed from: b */
        public final /* synthetic */ Context f270489b;

        public C93692b(long j, Context context) {
            this.f270488a = j;
            this.f270489b = context;
        }

        /* renamed from: a */
        public final void mo7429a() {
            if (this.f270488a != -1) {
                Intent intent = new Intent();
                intent.putExtra("key_fav_scene", 5);
                intent.putExtra("key_fav_item_id", this.f270488a);
                C100734q.m131875t0(this.f270489b, ".ui.FavTagEditUI", intent, (Bundle) null);
            }
        }
    }

    /* renamed from: EV */
    public String mo72466EV(String str) {
        if (str != null) {
            if (!(str.length() == 0)) {
                String substring = str.substring(2, str.length() - 2);
                C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring;
            }
        }
        Log.m105920e("MicroMsg.FavUrlLienService", "[parseExcerptKey] string empty");
        return "";
    }

    /* renamed from: KO */
    public long mo72467KO(String str) {
        C87412m.m108594g(str, "sourceId");
        C100755z Ow = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142263Ow(str);
        if (Ow != null) {
            return Ow.field_localId;
        }
        return -1;
    }

    public String Sh0(int i) {
        if (i <= 1) {
            return "";
        }
        String q = C76577a.m92166q(MMApplicationContext.getContext(), C0966R.string.f360439cu0);
        StringBuilder sb = new StringBuilder();
        C87412m.m108593f(q, FirebaseAnalytics.C113379b.ORIGIN);
        String format = String.format(q, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        sb.append(format);
        sb.append(' ');
        return sb.toString();
    }

    public C101756ae0 en0(String str) {
        C101801kd0 kd02;
        C101756ae0 ae02;
        C87412m.m108594g(str, "sourceId");
        C100755z Ow = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142263Ow(str);
        if (Ow == null || (kd02 = Ow.field_favProto) == null || (ae02 = kd02.f298622j) == null) {
            return null;
        }
        return ae02;
    }

    /* renamed from: hW */
    public void mo72470hW(Context context, String str, C75018a.C75025e eVar, long j) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
        C87412m.m108594g(eVar, "visibilityListener");
        if (context instanceof Activity) {
            C75026b.m89954d((Activity) context, str, C76577a.m92166q(context, C0966R.string.cmy), MMApplicationContext.isMainProcess() ? C93691a.f270487a : new C93692b(j, context), eVar);
        }
    }

    /* renamed from: wn */
    public LinkedList<C52097yc0> mo72471wn(String str) {
        LinkedList<C52097yc0> linkedList = new LinkedList<>();
        if (str != null) {
            if (!(str.length() == 0)) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        C87412m.m108593f(jSONObject, "array.getJSONObject(i)");
                        String string = jSONObject.getString("excerptKey");
                        String string2 = jSONObject.getString(MimeTypes.BASE_TYPE_TEXT);
                        String string3 = jSONObject.getString("url");
                        C52097yc0 yc02 = new C52097yc0();
                        yc02.f145225d = string;
                        yc02.f145226e = string2;
                        yc02.f145227f = string3;
                        linkedList.add(yc02);
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.FavUrlLienService", e, e.toString(), new Object[0]);
                }
                return linkedList;
            }
        }
        Log.m105920e("MicroMsg.FavUrlLienService", "[parseLineExcerpt] json empty");
        return linkedList;
    }
}
