package wg1;

import a14.C0000n0;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.messenger.foundation.PluginMessengerFoundation;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C7250m;
import di3.C86312j;
import eb0.C45628s0;
import fy3.C32227p;
import kg3.C76577a;
import kotlin.ResultKt;
import pc0.C100765f;
import rx3.C13598b0;
import tf0.C64916p1;
import wc3.C78541w;
import wd3.C65953v0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.component.FinderLiveNoticeQRCodeUIC$buildShareBottomSheet$prepareQuickShareMenu$1$1$1", mo125469f = "FinderLiveNoticeQRCodeUIC.kt", mo125470l = {720}, mo125471m = "invokeSuspend")
/* renamed from: wg1.d2 */
public final class C15264d2 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f41511d;

    /* renamed from: e */
    public final /* synthetic */ C15370z1 f41512e;

    /* renamed from: f */
    public final /* synthetic */ String f41513f;

    /* renamed from: wg1.d2$a */
    public static final class C15265a implements C65953v0 {

        /* renamed from: a */
        public final /* synthetic */ String f41514a;

        /* renamed from: b */
        public final /* synthetic */ C15370z1 f41515b;

        /* renamed from: c */
        public final /* synthetic */ String f41516c;

        public C15265a(String str, C15370z1 z1Var, String str2) {
            this.f41514a = str;
            this.f41515b = z1Var;
            this.f41516c = str2;
        }

        /* renamed from: a */
        public final void mo23a(boolean z, String str, int i) {
            if (z && !Util.isNullOrNil(this.f41514a)) {
                String str2 = this.f41514a;
                if (str2 == null) {
                    str2 = "";
                }
                if (!TextUtils.isEmpty(str)) {
                    SendMsgEvent sendMsgEvent = new SendMsgEvent();
                    SendMsgEvent.C1132a aVar = sendMsgEvent.f9496d;
                    aVar.f9497a = str2;
                    aVar.f9498b = str;
                    aVar.f9499c = C45628s0.m50810y(str2);
                    sendMsgEvent.f9496d.f9500d = 0;
                    sendMsgEvent.publish();
                }
                C7250m.m7431a().mo136256TG(this.f41515b.getActivity(), this.f41514a, this.f41516c, 0, "", "", (C100765f) null);
                C75026b.m89951a(this.f41515b.getActivity(), "已发送");
                ((PluginMessengerFoundation) C86312j.m106911c(PluginMessengerFoundation.class)).mo96076P7().mo90704g(this.f41514a);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15264d2(C15370z1 z1Var, String str, C15601d<? super C15264d2> dVar) {
        super(2, dVar);
        this.f41512e = z1Var;
        this.f41513f = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C15264d2(this.f41512e, this.f41513f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C15264d2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f41511d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C15370z1 z1Var = this.f41512e;
            this.f41511d = 1;
            obj = C15370z1.m14342c3(z1Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C15370z1 z1Var2 = this.f41512e;
        String str = this.f41513f;
        String e802 = ((C64916p1) C86312j.m106911c(C64916p1.class)).e80();
        BitmapUtil.saveBitmapToImage((Bitmap) obj, 80, Bitmap.CompressFormat.JPEG, e802, true);
        Bitmap bitmap = null;
        if (e802 != null && !Util.isNullOrNil(e802)) {
            Bitmap bitmapNative = BitmapUtil.getBitmapNative(e802, 140, 140, C76577a.m92156g(MMApplicationContext.getContext()));
            int orientationInDegree = Exif.fromFile(e802).getOrientationInDegree();
            if (orientationInDegree < 0) {
                orientationInDegree = 0;
            }
            bitmap = BitmapUtil.rotate(bitmapNative, (float) orientationInDegree);
        }
        ((C78541w) C86312j.m106911c(C78541w.class)).mo108484Gd(z1Var2.getActivity(), str, bitmap, z1Var2.getActivity().getString(C0966R.string.a2s), 3, new C15265a(str, z1Var2, e802)).show();
        return C13598b0.f38549a;
    }
}
