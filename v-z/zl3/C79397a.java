package zl3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.result.C67074b;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$g;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$i;
import com.tencent.p014mm.p136ui.halfscreen.MMHalfScreenDialogFragment;
import com.tencent.xweb.IXWebBroadcastListener;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import org.xwalk.core.XWalkEnvironment;
import p431e.C75464c;
import p918s2.C118252b;
import z04.C112551y;

/* renamed from: zl3.a */
public final class C79397a {

    /* renamed from: a */
    public Context f232909a;

    /* renamed from: b */
    public Bundle f232910b;

    /* renamed from: c */
    public String f232911c = "";

    /* renamed from: d */
    public Class<? extends MMHalfScreenDialogFragment> f232912d = MMHalfScreenDialogFragment.class;

    /* renamed from: e */
    public MMFragmentActivity$$g f232913e;

    /* renamed from: f */
    public int f232914f;

    /* renamed from: g */
    public String f232915g = "";

    /* renamed from: h */
    public boolean f232916h = true;

    /* renamed from: i */
    public boolean f232917i;

    /* renamed from: zl3.a$a */
    public static final class C79398a {

        /* renamed from: a */
        public final C79397a f232918a = new C79397a();

        /* renamed from: zl3.a$a$a */
        public static final class C79399a implements MMFragmentActivity$$g {

            /* renamed from: a */
            public final /* synthetic */ C79398a f232919a;

            public C79399a(C79398a aVar) {
                this.f232919a = aVar;
            }

            /* renamed from: a */
            public final void mo5702a(int i, Intent intent) {
                MMFragmentActivity$$g mMFragmentActivity$$g = this.f232919a.f232918a.f232913e;
                if (mMFragmentActivity$$g != null) {
                    mMFragmentActivity$$g.mo5702a(i, intent);
                }
            }
        }

        /* renamed from: a */
        public final C79398a mo109371a(String str) {
            C87412m.m108594g(str, "activityClsName");
            C79397a aVar = this.f232918a;
            aVar.getClass();
            aVar.f232911c = str;
            return this;
        }

        /* renamed from: b */
        public final C79398a mo109372b(Class<? extends MMHalfScreenDialogFragment> cls) {
            C87412m.m108594g(cls, "cls");
            C79397a aVar = this.f232918a;
            aVar.getClass();
            aVar.f232912d = cls;
            return this;
        }

        /* renamed from: c */
        public final C79398a mo109373c(Intent intent) {
            this.f232918a.f232910b = intent != null ? intent.getExtras() : null;
            return this;
        }

        /* renamed from: d */
        public final void mo109374d() {
            Bundle bundle;
            MMFragmentActivity$$i mMFragmentActivity$$i;
            C79397a aVar = this.f232918a;
            Context context = aVar.f232909a;
            Activity activity = null;
            if (!C112551y.m153811k(aVar.f232911c)) {
                bundle = new Bundle();
                bundle.putString("KEY_BUNDLE_ACTIVITY_CLS_NAME", aVar.f232911c);
                bundle.putBundle("KEY_BUNDLE_BUNDLE", aVar.f232910b);
                bundle.putSerializable("KEY_BUNDLE_DIALOG_FRAGMENT_CLS", aVar.f232912d);
                bundle.putBoolean("KEY_BUNDLE_ENABLE_PULL_DOWN_CLOSE", aVar.f232916h);
                bundle.putBoolean("KEY_TRANSPARENT_NAVIGATIONBAR", aVar.f232917i);
            } else {
                bundle = null;
            }
            if (context != null && bundle != null) {
                Intent intent = new Intent();
                if (C87412m.m108589b(this.f232918a.f232915g, XWalkEnvironment.MODULE_TOOLS)) {
                    intent.setClassName(context, "com.tencent.mm.ui.halfscreen.HalfScreenTransparentActivityForTool");
                } else {
                    intent.setClassName(context, "com.tencent.mm.ui.halfscreen.HalfScreenTransparentActivity");
                }
                intent.putExtra("INTENT_KEY_HALFSCREEN_BUNDLE", bundle);
                boolean z = context instanceof Activity;
                if (!z) {
                    intent.addFlags(268435456);
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent);
                    Context context2 = context;
                    C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/ui/halfscreen/HalfScreenActivityHelper$Builder", IXWebBroadcastListener.STAGE_START, "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(context2, "com/tencent/mm/ui/halfscreen/HalfScreenActivityHelper$Builder", IXWebBroadcastListener.STAGE_START, "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    C79397a aVar3 = this.f232918a;
                    int i = aVar3.f232914f;
                    if (i != 0) {
                        C9556a aVar4 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar4.mo10233c(Integer.valueOf(i));
                        aVar4.mo10233c(intent);
                        C117292a.m165364j((Activity) context, aVar4.mo10232b(), "com/tencent/mm/ui/halfscreen/HalfScreenActivityHelper$Builder", IXWebBroadcastListener.STAGE_START, "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                    } else if (aVar3.f232913e == null) {
                        C9556a aVar5 = new C9556a();
                        aVar5.mo10233c(intent);
                        Context context3 = context;
                        C117292a.m165358d(context3, aVar5.mo10232b(), "com/tencent/mm/ui/halfscreen/HalfScreenActivityHelper$Builder", IXWebBroadcastListener.STAGE_START, "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((Intent) aVar5.mo10231a(0));
                        C117292a.m165359e(context3, "com/tencent/mm/ui/halfscreen/HalfScreenActivityHelper$Builder", IXWebBroadcastListener.STAGE_START, "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } else {
                        Activity activity2 = (Activity) context;
                        if (!(activity2 instanceof ComponentActivity)) {
                            mMFragmentActivity$$i = null;
                        } else {
                            mMFragmentActivity$$i = new MMFragmentActivity$$i();
                            C67074b<?> e = ((ComponentActivity) activity2).getActivityResultRegistry().mo164682e(String.valueOf(System.currentTimeMillis()), new C75464c(), mMFragmentActivity$$i);
                            mMFragmentActivity$$i.f214429b = e;
                            e.mo91081a(intent, (C118252b) null);
                        }
                        if (mMFragmentActivity$$i != null) {
                            mMFragmentActivity$$i.f214428a = new C79399a(this);
                        }
                    }
                }
                if (z) {
                    activity = (Activity) context;
                }
                if (activity != null) {
                    activity.overridePendingTransition(0, 0);
                }
            }
        }
    }
}
