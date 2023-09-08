package ty1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.game.luggage.page.C41954g;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameWebTabUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import p385u2.C111105a;
import zt3.C119157j;

/* renamed from: ty1.c */
public final class C52393c extends C41954g {

    /* renamed from: a1 */
    public static final /* synthetic */ int f146452a1 = 0;

    /* renamed from: Q0 */
    public final ArrayList<ImageView> f146453Q0 = new ArrayList<>();

    /* renamed from: R0 */
    public boolean f146454R0 = true;

    /* renamed from: S0 */
    public boolean f146455S0;

    /* renamed from: T0 */
    public int f146456T0;

    /* renamed from: U0 */
    public boolean f146457U0;

    /* renamed from: V0 */
    public int f146458V0;

    /* renamed from: W */
    public final GameWebPage f146459W;

    /* renamed from: W0 */
    public boolean f146460W0;

    /* renamed from: X0 */
    public boolean f146461X0;

    /* renamed from: Y0 */
    public String f146462Y0;

    /* renamed from: Z0 */
    public final C1256g<Bundle> f146463Z0 = new C52394a(this);

    /* renamed from: p0 */
    public final Bundle f146464p0;

    /* renamed from: x0 */
    public ImageView f146465x0;

    /* renamed from: y0 */
    public TextView f146466y0;

    /* renamed from: ty1.c$a */
    public static final class C52394a<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C52393c f146467d;

        public C52394a(C52393c cVar) {
            this.f146467d = cVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            if (bundle != null) {
                int i = bundle.getInt("msg_unread_count");
                int i2 = bundle.getInt("notify_unread_count");
                boolean z = bundle.getBoolean("has_chat_room_unread_msg");
                boolean z2 = bundle.getBoolean("bottom_red_dot");
                ((C119157j) C119157j.f356862d).mo183895z(new C52392b(this.f146467d, i, i2, z, z2));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52393c(GameWebPage gameWebPage, Bundle bundle) {
        super(gameWebPage);
        C87412m.m108594g(gameWebPage, "page");
        C87412m.m108594g(bundle, "params");
        this.f146459W = gameWebPage;
        this.f146464p0 = bundle;
    }

    /* renamed from: e */
    public void mo65845e() {
        super.mo65845e();
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCInteger(2), GameWebTabUI.IPCInvoke_readGameLifeConversation.class, (C1256g) null);
    }

    /* renamed from: g */
    public void mo65847g(boolean z) {
        super.mo65847g(z);
        for (ImageView imageView : this.f146453Q0) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                C74933u4.m89769f(drawable, z ? C111105a.m151500b(getContext(), C0966R.color.al9) : C111105a.m151500b(getContext(), C0966R.color.f3135ap));
                imageView.setImageDrawable(drawable);
            }
        }
    }

    public final GameWebPage getPage() {
        return this.f146459W;
    }

    public final Bundle getParams() {
        return this.f146464p0;
    }

    /* renamed from: o */
    public final void mo73392o(ImageView imageView, int i) {
        Context context = getContext();
        Object obj = C111105a.f332697a;
        Drawable b = C111105a.C111110c.m151511b(context, i);
        if (b != null) {
            C74933u4.m89769f(b, C111105a.m151500b(getContext(), C0966R.color.f3133gi));
            imageView.setImageDrawable(b);
        }
    }

    /* renamed from: p */
    public final long mo73393p(Uri uri, String str) {
        try {
            return Long.parseLong(uri.getQueryParameter(str));
        } catch (NumberFormatException unused) {
            Log.m105920e("GameWebSettingActionBar", "gamelog parse long error key = " + str + " uri = " + uri);
            return 0;
        }
    }

    /* renamed from: q */
    public final void mo73394q(boolean z, String str) {
        if (str == null) {
            str = this.f146464p0.getString("game_tab_key");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isred", this.f146457U0 ? "1" : "2");
        hashMap.put("TotalNum", String.valueOf(this.f146458V0));
        hashMap.put("page", String.valueOf(str));
        C40314g.m43484c(getContext(), 37, 3701, z ? 1 : 0, z ? 6 : 1, this.f146456T0, C40314g.m43483b(hashMap));
    }

    public void setAlpha(float f) {
        super.setAlpha(f);
        if (f == 0.0f) {
            f = 1.0f;
        }
        if (f >= 0.0f && f <= 1.0f) {
            int i = (int) (f * ((float) 255));
            for (ImageView imageAlpha : this.f146453Q0) {
                imageAlpha.setImageAlpha(i);
            }
        }
    }
}
