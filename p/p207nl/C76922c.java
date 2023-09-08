package p207nl;

import android.app.Activity;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.snackbar.C75018a;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import gy3.C87412m;
import o40.C61926c;

/* renamed from: nl.c */
public final class C76922c {

    /* renamed from: a */
    public final Activity f224784a;

    /* renamed from: b */
    public final ViewGroup f224785b;

    /* renamed from: c */
    public final String f224786c;

    /* renamed from: d */
    public final EmojiInfo f224787d;

    /* renamed from: e */
    public final String f224788e = "MicroMsg.EmojiCustomHelper";

    /* renamed from: f */
    public final int f224789f = 3300;

    /* renamed from: g */
    public final int f224790g = 800;

    /* renamed from: h */
    public long f224791h;

    /* renamed from: i */
    public C75018a f224792i;

    /* renamed from: j */
    public final Runnable f224793j = new C76923a(this);

    /* renamed from: nl.c$a */
    public static final class C76923a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C76922c f224794d;

        public C76923a(C76922c cVar) {
            this.f224794d = cVar;
        }

        public final void run() {
            C76922c cVar = this.f224794d;
            C75018a.C75023c cVar2 = new C75018a.C75023c(cVar.f224784a, cVar.f224785b);
            cVar2.f220747c = this.f224794d.f224784a.getString(C0966R.string.c_c);
            cVar2.f220749e = Integer.MAX_VALUE;
            cVar.f224792i = cVar2.mo104599a();
            this.f224794d.f224791h = Util.currentTicks();
        }
    }

    public C76922c(Activity activity, ViewGroup viewGroup, String str, EmojiInfo emojiInfo) {
        C87412m.m108594g(activity, "context");
        C87412m.m108594g(viewGroup, "container");
        C87412m.m108594g(emojiInfo, "emojiInfo");
        this.f224784a = activity;
        this.f224785b = viewGroup;
        this.f224786c = str;
        this.f224787d = emojiInfo;
    }

    /* renamed from: a */
    public static final void m92779a(C76922c cVar, boolean z) {
        C61926c.m72698w(cVar.f224793j);
        C61926c.m72666K(((long) 700) - Util.ticksToNow(cVar.f224791h), new C76926g(cVar, z));
    }
}
