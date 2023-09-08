package com.tencent.p014mm.plugin.vlog.p117ui.fake;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import bi2.C92262a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.vlog.model.C57463v;
import com.tencent.p014mm.plugin.vlog.model.C96536f;
import com.tencent.p014mm.plugin.vlog.model.C96551o;
import com.tencent.p014mm.plugin.vlog.model.C96552p0;
import com.tencent.p014mm.plugin.vlog.model.C96553q;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.videocomposition.play.VideoCompositionPlayView;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import ei2.C97651f;
import f72.C97842b;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import kotlin.Metadata;
import nj3.C88989a;
import o40.C61926c;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C101758az;
import te3.C64339ea;
import te3.C64346ep3;
import te3.C64899zy;
import zg2.C103020m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/fake/VLogFakePlayActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
/* renamed from: com.tencent.mm.plugin.vlog.ui.fake.VLogFakePlayActivity */
public final class VLogFakePlayActivity extends MMActivity {

    /* renamed from: g */
    public static final /* synthetic */ int f282701g = 0;

    /* renamed from: d */
    public VideoCompositionPlayView f282702d;

    /* renamed from: e */
    public C97651f f282703e;

    /* renamed from: f */
    public EffectManager f282704f = new EffectManager();

    /* renamed from: com.tencent.mm.plugin.vlog.ui.fake.VLogFakePlayActivity$a */
    public static final class C30525a extends C87413o implements C32226l<C96553q, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ VLogFakePlayActivity f82241d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30525a(VLogFakePlayActivity vLogFakePlayActivity) {
            super(1);
            this.f82241d = vLogFakePlayActivity;
        }

        public Object invoke(Object obj) {
            C96553q qVar = (C96553q) obj;
            C87412m.m108594g(qVar, LocaleUtil.ITALIAN);
            C61926c.m72668M(new C30526a(this.f82241d, qVar));
            return C13598b0.f38549a;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cc7;
    }

    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        setSelfNavigationBarVisible(8);
        C97842b.f286991a = true;
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("composition_proto");
        C64899zy zyVar = new C64899zy();
        if (byteArrayExtra != null) {
            try {
                zyVar.parseFrom(byteArrayExtra);
            } catch (Exception e) {
                Log.printDebugStack("safeParser", "", e);
            }
        }
        C96552p0 d = C96551o.m123874d(zyVar, this.f282704f);
        C57463v.C57464a.m66220b(new C96536f(), zyVar, false, new C30525a(this), 2, (Object) null);
        Rect rect = new Rect();
        C96551o.m123876f(zyVar.f186904i.f297899g, rect);
        d.mo81183b(rect);
        C103020m mVar = C103020m.f303985a;
        LinkedList<C64339ea> linkedList = zyVar.f186906n.f186611e;
        C87412m.m108593f(linkedList, "compositionInfo.editData.baseItemData");
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        ArrayList<C92262a> d2 = mVar.mo142736d(linkedList, context);
        LinkedList<Integer> linkedList2 = zyVar.f186906n.f186610d.f183015d;
        C87412m.m108593f(linkedList2, "compositionInfo.editData.drawingRect.values");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList2, 10));
        for (Integer intValue : linkedList2) {
            arrayList.add(Float.valueOf((float) intValue.intValue()));
        }
        float[] v0 = C110818d0.m150950v0(arrayList);
        C8479f0 f0Var = new C8479f0();
        C64346ep3 ep32 = zyVar.f186906n.f186613g;
        if (ep32 != null) {
            LinkedList<Integer> linkedList3 = ep32.f183015d;
            C87412m.m108593f(linkedList3, "rectProto.values");
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList3, 10));
            for (Integer intValue2 : linkedList3) {
                arrayList2.add(Float.valueOf((float) intValue2.intValue()));
            }
            f0Var.f27484d = C110818d0.m150950v0(arrayList2);
        }
        C101758az azVar = zyVar.f186904i;
        C97651f fVar = new C97651f(v0, (float[]) f0Var.f27484d, d2, azVar.f297897e, azVar.f297898f);
        this.f282703e = fVar;
        d.mo134622s(fVar);
        C97651f fVar2 = this.f282703e;
        if (fVar2 != null) {
            fVar2.start();
        }
        VideoCompositionPlayView videoCompositionPlayView = (VideoCompositionPlayView) findViewById(C0966R.C0970id.l_a);
        this.f282702d = videoCompositionPlayView;
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) (videoCompositionPlayView != null ? videoCompositionPlayView.getLayoutParams() : null);
        if (layoutParams != null) {
            layoutParams.f44410B = String.valueOf((((float) rect.width()) * 1.0f) / ((float) rect.height()));
            VideoCompositionPlayView videoCompositionPlayView2 = this.f282702d;
            if (videoCompositionPlayView2 != null) {
                videoCompositionPlayView2.setLayoutParams(layoutParams);
            }
        }
        VideoCompositionPlayView videoCompositionPlayView3 = this.f282702d;
        if (videoCompositionPlayView3 != null) {
            videoCompositionPlayView3.mo79510k(d.mo134611h());
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C97651f fVar = this.f282703e;
        if (fVar != null) {
            fVar.destroy();
        }
        this.f282704f.mo154931k();
    }
}
