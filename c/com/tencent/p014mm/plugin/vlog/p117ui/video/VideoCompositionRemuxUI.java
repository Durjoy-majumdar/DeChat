package com.tencent.p014mm.plugin.vlog.p117ui.video;

import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import a33.C91954f;
import a33.C91957h;
import a33.C91960i;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMBaseActivity;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import eh2.C58601a;
import gy3.C8480h;
import gy3.C87412m;
import h90.C98324b;
import ih2.C60287a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import qh2.C101198e;
import sp3.C110803f;
import sx3.C26236u;
import th2.C101891f;
import wx3.C15601d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/video/VideoCompositionRemuxUI;", "Lcom/tencent/mm/ui/MMBaseActivity;", "<init>", "()V", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.video.VideoCompositionRemuxUI */
public final class VideoCompositionRemuxUI extends MMBaseActivity {

    /* renamed from: e */
    public final String f282729e = ("MicroMsg.VideoCompositionRemuxUI[" + hashCode() + ']');

    /* renamed from: f */
    public C91957h f282730f;

    /* renamed from: g */
    public final C91954f f282731g = new C91954f();

    /* renamed from: h */
    public RecordConfigProvider f282732h;

    /* renamed from: i */
    public C98324b f282733i;

    /* renamed from: j */
    public C53973z1 f282734j;

    public void onCreate(Bundle bundle) {
        String str;
        Bundle bundle2;
        super.onCreate(bundle);
        Log.m105924i(this.f282729e, "onCreate");
        setContentView(C0966R.C0971layout.d5t);
        Log.m105924i(this.f282729e, "initData");
        this.f282730f = new C91957h(this, (C101198e) null);
        CaptureDataManager captureDataManager = CaptureDataManager.f272890c;
        captureDataManager.f272891a = new C58601a();
        captureDataManager.f272892b.clear();
        this.f282732h = (RecordConfigProvider) getIntent().getParcelableExtra("KEY_PARAMS_CONFIG");
        Log.m105924i(this.f282729e, "initMediaInfoFromProvider");
        C98324b bVar = new C98324b((String) null, (String) null, false, 0, 0, (String) null, (String) null, 0, 0, (String) null, (ArrayList) null, (ArrayList) null, false, (Bundle) null, (Rect) null, 0, 65535, (C8480h) null);
        RecordConfigProvider recordConfigProvider = this.f282732h;
        if (recordConfigProvider != null) {
            ArrayList<String> arrayList = recordConfigProvider.f272907H;
            if (arrayList != null) {
                bVar.f288191l = arrayList;
            }
            ArrayList<String> arrayList2 = recordConfigProvider.f272906G;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                ArrayList<String> arrayList3 = recordConfigProvider.f272907H;
                if (!(arrayList3 == null || arrayList3.isEmpty()) && recordConfigProvider.f272907H.size() == 1) {
                    String str2 = recordConfigProvider.f272907H.get(0);
                    C87412m.m108593f(str2, "it.videos[0]");
                    String str3 = str2;
                    bVar.f288180a = str3;
                    bVar.f288184e = C94555d.m119567c(str3, true).f273443a;
                    String str4 = recordConfigProvider.f272902C;
                    C87412m.m108593f(str4, "it.thumbPath");
                    bVar.f288181b = str4;
                }
            }
            bVar.f288193n = recordConfigProvider.f272912M;
            if (!TextUtils.isEmpty(recordConfigProvider.f272900A) && C86013q1.m106450k(recordConfigProvider.f272900A)) {
                String str5 = recordConfigProvider.f272900A;
                C87412m.m108593f(str5, "it.inputVideoPath");
                bVar.f288180a = str5;
                bVar.f288184e = C94555d.m119567c(recordConfigProvider.f272900A, true).f273443a;
                String str6 = recordConfigProvider.f272902C;
                C87412m.m108593f(str6, "it.thumbPath");
                bVar.f288181b = str6;
            }
        }
        this.f282733i = bVar;
        C101891f fVar = C101891f.f300035a;
        fVar.mo141377k(SystemClock.elapsedRealtime());
        RecordConfigProvider recordConfigProvider2 = this.f282732h;
        int i = recordConfigProvider2 != null ? recordConfigProvider2.f272905F : 0;
        Log.m105924i("MicroMsg.VideoWidgetReporter", "setEnterScene >> " + i);
        C101891f.f300036b.f265891e = i;
        RecordConfigProvider recordConfigProvider3 = this.f282732h;
        int i2 = (recordConfigProvider3 == null || (bundle2 = recordConfigProvider3.f272912M) == null) ? 0 : bundle2.getInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", 0);
        Log.m105924i("MicroMsg.VideoWidgetReporter", "setTecEnterScene >> type: " + i2);
        C101891f.f300036b.f265886T = i2;
        fVar.mo141373g(this.f282732h);
        C98324b bVar2 = this.f282733i;
        if (bVar2 == null || (str = bVar2.f288180a) == null) {
            str = "";
        }
        fVar.mo141380n(str);
        Log.m105924i(this.f282729e, "init media model");
        this.f282731g.mo125808d(C60287a.f171906a, C60287a.f171907b);
        C98324b bVar3 = this.f282733i;
        C87412m.m108591d(bVar3);
        List b = C26236u.m33719b(bVar3.mo137615e());
        List b2 = C26236u.m33719b(2);
        Integer[] numArr = new Integer[1];
        for (int i3 = 0; i3 < 1; i3++) {
            C98324b bVar4 = this.f282733i;
            numArr[i3] = Integer.valueOf((bVar4 == null || !bVar4.f288182c) ? 0 : 1);
        }
        this.f282734j = C53895h.m60466d(C53930o0.m60555b(), C53872d1.f151119c, (C53934p0) null, new C91960i(this, b, b2, numArr, (C15601d<? super C91960i>) null), 2, (Object) null);
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i(this.f282729e, "onDestroy");
        C53973z1 z1Var = this.f282734j;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        CaptureDataManager.f272890c.f272891a = null;
        C101891f.f300035a.mo141367a();
        C110803f.f331490g.mo162371a();
    }
}
