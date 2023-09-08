package iv1;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.forcenotify.p058ui.ForceNotifyAcceptUI;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import p447aw.C103918d;
import p657pz.C89445b;
import p687sr.C64153e;
import rx3.C13604l;
import vc3.C78382a;

/* renamed from: iv1.a */
public final class C60634a {

    /* renamed from: a */
    public static final C60634a f172741a = new C60634a();

    /* renamed from: iv1.a$a */
    public static final class C60635a implements ForceNotifyAcceptUI.C93814a {

        /* renamed from: a */
        public final /* synthetic */ C64153e.C64155b f172742a;

        /* renamed from: b */
        public final /* synthetic */ Context f172743b;

        public C60635a(C64153e.C64155b bVar, Context context) {
            this.f172742a = bVar;
            this.f172743b = context;
        }

        /* renamed from: a */
        public void mo85588a(ForceNotifyAcceptUI forceNotifyAcceptUI) {
            Log.m105928w("MicroMsg.ForceNotifyPermissionUtil", "checkPermission permission granted");
            if (forceNotifyAcceptUI != null) {
                forceNotifyAcceptUI.finish();
            }
            this.f172742a.mo4980a(true);
        }

        /* renamed from: b */
        public void mo85589b(ForceNotifyAcceptUI forceNotifyAcceptUI) {
            boolean Jn = ((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(this.f172743b);
            Log.m105928w("MicroMsg.ForceNotifyPermissionUtil", "checkPermission cancel, ok:" + Jn);
            if (forceNotifyAcceptUI != null) {
                forceNotifyAcceptUI.finish();
            }
            this.f172742a.mo4980a(Jn);
        }

        /* renamed from: c */
        public void mo85590c(ForceNotifyAcceptUI forceNotifyAcceptUI) {
            Log.m105928w("MicroMsg.ForceNotifyPermissionUtil", "checkPermission permission refused");
            if (forceNotifyAcceptUI != null) {
                forceNotifyAcceptUI.finish();
            }
            this.f172742a.mo4980a(false);
        }
    }

    /* renamed from: a */
    public final void mo85587a(Context context, int i, boolean z, C64153e.C64155b bVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "callback");
        if (((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(context)) {
            Log.m105928w("MicroMsg.ForceNotifyPermissionUtil", "checkPermission already granted");
            bVar.mo4980a(true);
            return;
        }
        C72994y1.C72995a aVar = null;
        if (i == 2) {
            aVar = C72994y1.C72995a.USERINFO_FORCE_NOTIFY_PERMISSION_LIVE_POP_COUNT_INT_SYNC;
        }
        if (aVar != null) {
            int j = C86709a0.m107535s().mo121142i().mo119689j(aVar, 0);
            if (j >= 1) {
                bVar.mo4980a(false);
                return;
            }
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(j + 1));
        }
        C60635a aVar2 = new C60635a(bVar, context);
        C13604l lVar = i != 1 ? i != 2 ? i != 3 ? new C13604l(context.getString(C0966R.string.f1w), context.getString(C0966R.string.f1u)) : new C13604l(context.getString(C0966R.string.f1w), context.getString(C0966R.string.mp_)) : new C13604l(context.getString(C0966R.string.f1x), context.getString(C0966R.string.f1v)) : new C13604l(context.getString(C0966R.string.f1w), context.getString(C0966R.string.f1u));
        String str = (String) lVar.f38555d;
        String str2 = (String) lVar.f38556e;
        ForceNotifyAcceptUI.C93814a aVar3 = ForceNotifyAcceptUI.f270753f;
        String b = C78382a.m94650b();
        C87412m.m108593f(b, "getMessageChannelIdUse()");
        Class<ForceNotifyAcceptUI> cls = ForceNotifyAcceptUI.class;
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str2, "warningContent");
        ForceNotifyAcceptUI.f270753f = aVar2;
        Intent intent = new Intent(context, cls);
        intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, str);
        intent.putExtra("warning_content", str2);
        if (z) {
            intent.addFlags(805306368);
        }
        String canonicalName = cls.getCanonicalName();
        C87412m.m108591d(canonicalName);
        ((C89445b) C86312j.m106911c(C89445b.class)).Mo0(context, intent, str2, canonicalName, false, b, false);
    }
}
