package xk3;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.MenuItem;
import android.view.View;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C7240a;
import d62.C7241k;
import di3.C86312j;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Map;
import kg3.C76577a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import o62.C11375e;
import qo3.C77407n;
import wd3.C53155r0;

/* renamed from: xk3.c */
public class C15810c extends C11375e {

    /* renamed from: xk3.c$a */
    public class C15811a extends C7240a {

        /* renamed from: e */
        public final /* synthetic */ WeakReference f42593e;

        /* renamed from: f */
        public final /* synthetic */ String f42594f;

        /* renamed from: g */
        public final /* synthetic */ String f42595g;

        /* renamed from: h */
        public final /* synthetic */ String f42596h;

        /* renamed from: i */
        public final /* synthetic */ String f42597i;

        /* renamed from: j */
        public final /* synthetic */ String f42598j;

        /* renamed from: n */
        public final /* synthetic */ Map f42599n;

        /* renamed from: o */
        public final /* synthetic */ Bundle f42600o;

        /* renamed from: p */
        public final /* synthetic */ WeakReference f42601p;

        /* renamed from: xk3.c$a$a */
        public class C15812a implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ Context f42603d;

            public C15812a(Context context) {
                this.f42603d = context;
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.mo107142f(100, this.f42603d.getResources().getString(C0966R.string.i6k));
                e0Var.mo107142f(101, Util.safeFormatString(this.f42603d.getResources().getString(C0966R.string.b4f), C15811a.this.f42595g));
            }
        }

        /* renamed from: xk3.c$a$b */
        public class C15813b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ C77407n f42605d;

            /* renamed from: e */
            public final /* synthetic */ Context f42606e;

            public C15813b(C77407n nVar, Context context) {
                this.f42605d = nVar;
                this.f42606e = context;
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                this.f42605d.mo107572p();
                int itemId = menuItem.getItemId();
                if (itemId == 100) {
                    C15811a aVar = C15811a.this;
                    C15810c cVar = C15810c.this;
                    String str = aVar.f42596h;
                    cVar.getClass();
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(str);
                    WeakReference<C11375e.C11378c> weakReference = cVar.f33501d;
                    if (weakReference != null && weakReference.get() != null) {
                        cVar.f33501d.get().mo11395t2(-1, linkedList, 0);
                    }
                } else if (itemId == 101) {
                    C15811a aVar2 = C15811a.this;
                    C15810c cVar2 = C15810c.this;
                    Context context = this.f42606e;
                    String str2 = aVar2.f42597i;
                    String str3 = aVar2.f42595g;
                    String str4 = aVar2.f42598j;
                    cVar2.getClass();
                    C77407n nVar = new C77407n(context, 1, true);
                    nVar.mo107568m(Util.safeFormatString(context.getString(C0966R.string.b4c, new Object[]{str3}), new Object[0]), 17, C76577a.m92151b(context, 14));
                    nVar.f225771i = new C15814d(cVar2, context);
                    nVar.f225782p = new C15815e(cVar2, str2, str4, context, nVar);
                    nVar.mo107573q();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15811a(int i, C53155r0 r0Var, WeakReference weakReference, String str, String str2, String str3, String str4, String str5, Map map, Bundle bundle, WeakReference weakReference2) {
            super(i, r0Var);
            this.f42593e = weakReference;
            this.f42594f = str;
            this.f42595g = str2;
            this.f42596h = str3;
            this.f42597i = str4;
            this.f42598j = str5;
            this.f42599n = map;
            this.f42600o = bundle;
            this.f42601p = weakReference2;
        }

        /* renamed from: a */
        public void mo1118a(View view) {
            Context context = (Context) this.f42593e.get();
            if (context != null) {
                C77407n nVar = new C77407n(context, 1, true);
                nVar.mo107568m(Util.safeFormatString(context.getString(C0966R.string.b4g), this.f42594f, this.f42595g), 17, C76577a.m92151b(context, 14));
                nVar.f225771i = new C15812a(context);
                nVar.f225782p = new C15813b(nVar, context);
                nVar.mo107573q();
                C15810c.this.getClass();
                ((C7241k) C86312j.m106911c(C7241k.class)).h80("link_revoke_unbindapp", this.f42599n, this.f42600o, this.f42593e, this.f42601p);
            }
        }
    }

    public C15810c(C11375e.C11378c cVar) {
        super(cVar);
    }

    /* renamed from: b */
    public String mo11238b() {
        return "link_revoke_unbindapp";
    }

    /* renamed from: c */
    public CharSequence mo11239c(Map<String, String> map, String str, Bundle bundle, WeakReference<Context> weakReference, WeakReference<NeatTextView> weakReference2) {
        Map<String, String> map2 = map;
        String str2 = str;
        String str3 = map2.get(str2 + ".title");
        String str4 = map2.get(str2 + ".appname");
        String str5 = map2.get(".sysmsg.sysmsgtemplate.content_template.link_list.link.memberlist.member.nickname");
        Bundle bundle2 = bundle;
        String string = bundle2.getString("conv_talker_username");
        SpannableString spannableString = new SpannableString(str3);
        spannableString.setSpan(new C15811a(1, (C53155r0) null, weakReference, str5, str4, map2.get(str2 + ".username"), map2.get(str2 + ".appid"), string, map2, bundle2, weakReference2), 0, str3.length(), 33);
        return spannableString;
    }
}
