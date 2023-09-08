package com.tencent.p014mm.plugin.record.p094ui.viewWrappers;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import com.tencent.p014mm.plugin.record.p094ui.C94356i;
import com.tencent.p014mm.plugin.record.p094ui.RecordVoiceBaseView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.SensorController;
import com.tencent.p014mm.sdk.platformtools.ShakeManager;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import p492dn.C75415t;
import qg2.C101165r0;
import qg2.C101169u;
import sg2.C101617b;

/* renamed from: com.tencent.mm.plugin.record.ui.viewWrappers.h */
public class C94394h implements C94356i.C94363d {

    /* renamed from: a */
    public C101165r0 f272839a = new C101165r0();

    /* renamed from: b */
    public RecordVoiceBaseView f272840b;

    /* renamed from: a */
    public void mo129755a(View view, int i, C101617b bVar, Object obj) {
        int i2;
        View view2 = view;
        C101617b bVar2 = bVar;
        View findViewById = view2.findViewById(C0966R.C0970id.cji);
        RecordVoiceBaseView recordVoiceBaseView = (RecordVoiceBaseView) view2.findViewById(C0966R.C0970id.lar);
        this.f272840b = recordVoiceBaseView;
        int i3 = bVar2.f297468e;
        if (i3 == 0) {
            recordVoiceBaseView.setVisibility(8);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view3 = findViewById;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/record/ui/viewWrappers/VoiceViewWrapper", "fillView", "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/record/ui/viewWrappers/VoiceViewWrapper", "fillView", "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (i3 == 1) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            C117292a.m165358d(findViewById, aVar2.mo10232b(), "com/tencent/mm/plugin/record/ui/viewWrappers/VoiceViewWrapper", "fillView", "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/record/ui/viewWrappers/VoiceViewWrapper", "fillView", "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f272840b.setVisibility(0);
            String b = C101169u.m132685b(bVar);
            FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
            FavoriteOperationEvent.C92515a aVar3 = favoriteOperationEvent.f264833d;
            aVar3.f264835a = 17;
            aVar3.f264840f = bVar2.f297464a;
            favoriteOperationEvent.publish();
            int i4 = favoriteOperationEvent.f264834e.f264855a;
            if (C86013q1.m106450k(b)) {
                i2 = i4;
            } else if (Util.isNullOrNil(bVar2.f297464a.f299325s)) {
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(0);
                View view4 = findViewById;
                i2 = i4;
                C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/record/ui/viewWrappers/VoiceViewWrapper", "fillView", "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/record/ui/viewWrappers/VoiceViewWrapper", "fillView", "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f272840b.setVisibility(8);
            } else {
                i2 = i4;
                Log.m105919d("MicroMsg.VoiceViewWrapper", "restart voice %s, url %s", Long.valueOf(bVar2.f297465b.field_localId), bVar2.f297464a.f299325s);
                FavoriteOperationEvent favoriteOperationEvent2 = new FavoriteOperationEvent();
                FavoriteOperationEvent.C92515a aVar5 = favoriteOperationEvent2.f264833d;
                aVar5.f264835a = 16;
                aVar5.f264839e = bVar2.f297465b.field_localId;
                favoriteOperationEvent2.publish();
            }
            RecordVoiceBaseView recordVoiceBaseView2 = this.f272840b;
            int i5 = bVar2.f297464a.f299338y;
            recordVoiceBaseView2.getClass();
            recordVoiceBaseView2.f272687j = Util.nullAs(b, "");
            recordVoiceBaseView2.f272688n = i2;
            if (recordVoiceBaseView2.f272686i != i5) {
                recordVoiceBaseView2.f272686i = i5;
                recordVoiceBaseView2.setText(((int) ((C75415t) C86312j.m106911c(C75415t.class)).F30((long) i5)) + "''");
            }
        }
    }

    /* renamed from: b */
    public View mo129756b(Context context) {
        View inflate = View.inflate(context, C0966R.C0971layout.bqk, (ViewGroup) null);
        ((RecordVoiceBaseView) inflate.findViewById(C0966R.C0970id.lar)).setVoiceHelper(this.f272839a);
        return inflate;
    }

    public void destroy() {
        C101165r0 r0Var = this.f272839a;
        r0Var.mo140612c();
        SensorController sensorController = C101165r0.f296102p;
        if (sensorController != null) {
            sensorController.removeSensorCallBack();
        }
        ShakeManager shakeManager = r0Var.f296108i;
        if (shakeManager != null) {
            shakeManager.stopShake();
        }
        C101165r0.f296102p = null;
        ((LinkedList) r0Var.f296111o).clear();
    }

    public void pause() {
        C101165r0 r0Var = this.f272839a;
        if (r0Var != null && ((LinkedList) r0Var.f296111o).size() > 0) {
            for (C101165r0.C101167b onFinish : this.f272839a.f296111o) {
                onFinish.onFinish();
            }
        }
    }
}
