package xk3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.google.android.gms.common.Scopes;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import d62.C7240a;
import d62.C7241k;
import di3.C86312j;
import java.lang.ref.WeakReference;
import java.util.Map;
import ke3.C88144b;
import o62.C11375e;
import p629ny.C76979h;
import wd3.C53155r0;

/* renamed from: xk3.a */
public class C15806a extends C11375e {

    /* renamed from: xk3.a$a */
    public class C15807a extends C7240a {

        /* renamed from: e */
        public final /* synthetic */ Map f42580e;

        /* renamed from: f */
        public final /* synthetic */ Bundle f42581f;

        /* renamed from: g */
        public final /* synthetic */ WeakReference f42582g;

        /* renamed from: h */
        public final /* synthetic */ WeakReference f42583h;

        /* renamed from: i */
        public final /* synthetic */ String f42584i;

        /* renamed from: j */
        public final /* synthetic */ String f42585j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15807a(int i, C53155r0 r0Var, Map map, Bundle bundle, WeakReference weakReference, WeakReference weakReference2, String str, String str2) {
            super(i, r0Var);
            this.f42580e = map;
            this.f42581f = bundle;
            this.f42582g = weakReference;
            this.f42583h = weakReference2;
            this.f42584i = str;
            this.f42585j = str2;
        }

        /* renamed from: a */
        public void mo1118a(View view) {
            C15806a.this.getClass();
            ((C7241k) C86312j.m106911c(C7241k.class)).h80("link_profile", this.f42580e, this.f42581f, this.f42582g, this.f42583h);
            WeakReference weakReference = this.f42582g;
            if (weakReference != null && weakReference.get() != null) {
                long j = this.f42581f.getLong("msg_id");
                String string = this.f42581f.getString("conv_talker_username", (String) null);
                if (C72996z1.m85820U5(string)) {
                    C15806a.m14743e(C15806a.this, (Context) this.f42582g.get(), this.f42584i, string, this.f42585j, j);
                } else {
                    C15806a.m14743e(C15806a.this, (Context) this.f42582g.get(), this.f42584i, (String) null, this.f42585j, j);
                }
            }
        }
    }

    public C15806a(C11375e.C11378c cVar) {
        super(cVar);
    }

    /* renamed from: e */
    public static void m14743e(C15806a aVar, Context context, String str, String str2, String str3, long j) {
        aVar.getClass();
        if (context != null && !Util.isNullOrNil(str)) {
            C115669n.INSTANCE.mo160131h(14516, 1, 0, 0, 0);
            Intent putExtra = new Intent().putExtra("Contact_User", str);
            putExtra.putExtra("Contact_ChatRoomId", str2);
            putExtra.putExtra("AntispamTicket", str3);
            putExtra.putExtra("room_name", str2);
            putExtra.putExtra("Contact_Scene", 14);
            putExtra.putExtra("key_msg_id", j);
            C88144b.m109791i(context, Scopes.PROFILE, ".ui.ContactInfoUI", putExtra, (Bundle) null);
        }
    }

    /* renamed from: b */
    public String mo11238b() {
        return "link_profile";
    }

    /* renamed from: c */
    public CharSequence mo11239c(Map<String, String> map, String str, Bundle bundle, WeakReference<Context> weakReference, WeakReference<NeatTextView> weakReference2) {
        Map<String, String> map2 = map;
        String str2 = str;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String nullAs = Util.nullAs(map2.get(str2 + ".separator"), "、");
        int i = 0;
        while (true) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(".memberlist.member");
            sb.append(i != 0 ? Integer.valueOf(i) : "");
            String sb4 = sb.toString();
            if (map2.get(sb4) == null) {
                return spannableStringBuilder;
            }
            if (i != 0) {
                spannableStringBuilder.append(nullAs);
            }
            String str3 = map2.get(sb4 + ".username");
            String str4 = map2.get(sb4 + ".nickname");
            String str5 = map2.get(sb4 + ".antispam_ticket");
            if (Util.isNullOrNil(str3) || Util.isNullOrNil(str4)) {
                Log.m105928w("MicroMsg.SysMsgHandlerProfile", "hy: can not resolve username or nickname");
            } else {
                C15807a aVar = r0;
                C15807a aVar2 = new C15807a(1, (C53155r0) null, map, bundle, weakReference, weakReference2, str3, str5);
                SpannableString T1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), str4);
                T1.setSpan(aVar, 0, str4.length(), 33);
                spannableStringBuilder.append(T1);
            }
            i++;
        }
    }
}
