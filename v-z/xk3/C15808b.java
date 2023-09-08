package xk3;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C7240a;
import d62.C7241k;
import di3.C86312j;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Map;
import o62.C11375e;
import wd3.C53155r0;

/* renamed from: xk3.b */
public class C15808b extends C11375e {

    /* renamed from: xk3.b$a */
    public class C15809a extends C7240a {

        /* renamed from: e */
        public final /* synthetic */ Bundle f42587e;

        /* renamed from: f */
        public final /* synthetic */ LinkedList f42588f;

        /* renamed from: g */
        public final /* synthetic */ Map f42589g;

        /* renamed from: h */
        public final /* synthetic */ WeakReference f42590h;

        /* renamed from: i */
        public final /* synthetic */ WeakReference f42591i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15809a(int i, C53155r0 r0Var, Bundle bundle, LinkedList linkedList, Map map, WeakReference weakReference, WeakReference weakReference2) {
            super(i, r0Var);
            this.f42587e = bundle;
            this.f42588f = linkedList;
            this.f42589g = map;
            this.f42590h = weakReference;
            this.f42591i = weakReference2;
        }

        /* renamed from: a */
        public void mo1118a(View view) {
            long j = this.f42587e.getLong("msg_id");
            C15808b bVar = C15808b.this;
            LinkedList linkedList = this.f42588f;
            WeakReference<C11375e.C11378c> weakReference = bVar.f33501d;
            if (!(weakReference == null || weakReference.get() == null)) {
                bVar.f33501d.get().mo11395t2(j, linkedList, 1);
            }
            C15808b.this.getClass();
            ((C7241k) C86312j.m106911c(C7241k.class)).h80("link_revoke", this.f42589g, this.f42587e, this.f42590h, this.f42591i);
        }
    }

    public C15808b(C11375e.C11378c cVar) {
        super(cVar);
    }

    /* renamed from: b */
    public String mo11238b() {
        return "link_revoke";
    }

    /* renamed from: c */
    public CharSequence mo11239c(Map<String, String> map, String str, Bundle bundle, WeakReference<Context> weakReference, WeakReference<NeatTextView> weakReference2) {
        Map<String, String> map2 = map;
        String str2 = str;
        String str3 = map.get(str + ".title");
        LinkedList linkedList = new LinkedList();
        int i = 0;
        while (true) {
            String str4 = str + ".usernamelist.username";
            if (i != 0) {
                str4 = str4 + i;
            }
            String str5 = map.get(str4);
            if (Util.isNullOrNil(str5)) {
                SpannableString spannableString = new SpannableString(str3);
                spannableString.setSpan(new C15809a(1, (C53155r0) null, bundle, linkedList, map, weakReference, weakReference2), 0, str3.length(), 33);
                return spannableString;
            }
            linkedList.add(str5);
            i++;
        }
    }
}
