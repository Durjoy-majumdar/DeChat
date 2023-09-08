package p395wu;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import be0.C16790h;
import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;
import com.tencent.p014mm.msgsubscription.p017ui.BizSubscribeMsgManagerUI;
import com.tencent.p014mm.msgsubscription.presenter.SubscribeMsgSettingData;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import ei3.C86522b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import jp3.C9486a;
import jp3.C9487b;
import k20.C60958c;
import k20.C9556a;
import p399xu.C23114b;
import rd0.C22222c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import td0.C22478a;
import ud0.C22642h;
import vd0.C22739d;
import xd0.C23076d;

@C86522b
/* renamed from: wu.b */
public final class C22928b extends C86301e implements C23114b {

    /* renamed from: d */
    public final C13601g f65908d = C36568h.m40985a(new C22929a(this));

    /* renamed from: wu.b$a */
    public static final class C22929a extends C87413o implements C32224a<C22222c> {

        /* renamed from: d */
        public final /* synthetic */ C22928b f65909d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22929a(C22928b bVar) {
            super(0);
            this.f65909d = bVar;
        }

        public Object invoke() {
            if (MMApplicationContext.isMainProcess()) {
                this.f65909d.getClass();
                return new C22931c(C23076d.f66292a);
            } else if (!MMApplicationContext.isToolsProcess()) {
                return null;
            } else {
                this.f65909d.getClass();
                return new C22642h();
            }
        }
    }

    /* renamed from: wu.b$b */
    public static final class C22930b extends C22478a {
        public C22930b(C23076d dVar) {
            super(dVar);
        }

        /* renamed from: g */
        public void mo35366g(Context context, int i, String str, String str2) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(str, "bizUsername");
            C87412m.m108594g(str2, "nickname");
            Log.m105925i("MicroMsg.SubscribeMsgFeatureService", "goToSettingManagerUI bizUsername: %s, nickname: %s", str, str2);
            Intent intent = new Intent(context, BizSubscribeMsgManagerUI.class);
            intent.putExtra("key_biz_username", str);
            intent.putExtra("key_biz_nickname", str2);
            intent.putExtra("key_biz_presenter_class", C22739d.class.getName());
            if (context instanceof Activity) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(100);
                aVar.mo10233c(intent);
                C117292a.m165364j((Activity) context, aVar.mo10232b(), "com/tencent/mm/feature/msgsubscription/SubscribeMsgFeatureService$createInstanceForWxa$1", "goToSettingManagerUI", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                return;
            }
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            C117292a.m165358d(context, aVar2.mo10232b(), "com/tencent/mm/feature/msgsubscription/SubscribeMsgFeatureService$createInstanceForWxa$1", "goToSettingManagerUI", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/feature/msgsubscription/SubscribeMsgFeatureService$createInstanceForWxa$1", "goToSettingManagerUI", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: Uf */
    public C22222c mo36102Uf() {
        return (C22222c) ((C36570n) this.f65908d).getValue();
    }

    /* renamed from: fr */
    public C22222c mo36103fr() {
        return new C22930b(C23076d.f66292a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: be0.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: be0.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: be0.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: be0.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: hO */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36104hO(java.lang.String r2, jp3.C9487b<? super jp3.C9486a> r3, fy3.C32226l<? super com.tencent.p014mm.msgsubscription.presenter.SubscribeMsgSettingData, rx3.C13598b0> r4) {
        /*
            r1 = this;
            java.lang.String r0 = "userName"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.String r0 = "receiver"
            gy3.C87412m.m108594g(r4, r0)
            be0.g r0 = new be0.g
            r0.<init>(r2, r4)
            if (r3 != 0) goto L_0x0013
            goto L_0x001e
        L_0x0013:
            be0.f r4 = new be0.f
            r4.<init>()
            r4.f45349d = r0
            r3.keep(r4)
            r0 = r4
        L_0x001e:
            sd0.b r3 = new sd0.b
            r4 = 3
            r3.<init>(r2, r4)
            r3.f63381f = r0
            sd0.a r2 = sd0.C22355a.f63371a
            r3.mo35487b(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p395wu.C22928b.mo36104hO(java.lang.String, jp3.b, fy3.l):void");
    }

    /* renamed from: n2 */
    public void mo36105n2() {
        C23076d.f66292a.mo36472n2();
    }

    /* renamed from: r7 */
    public void mo36106r7(String str, SubscribeMsgSettingData subscribeMsgSettingData, C9487b<? super C9486a> bVar, C32226l<? super SubscribeMsgRequestResult, C13598b0> lVar) {
        C87412m.m108594g(str, "userName");
        C87412m.m108594g(subscribeMsgSettingData, "data");
        C87412m.m108594g(lVar, "receiver");
        C16790h.f45352a.mo17819a(str, subscribeMsgSettingData, bVar, lVar);
    }

    /* renamed from: u7 */
    public String mo36107u7() {
        return C22739d.class.getName();
    }
}
