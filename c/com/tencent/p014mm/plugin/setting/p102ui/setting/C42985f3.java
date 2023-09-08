package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Context;
import android.os.Message;
import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ob0.C117747y;
import p216op.C47389f;
import p216op.C47390g;
import p216op.C47392i;
import p910lj.C76701a;
import uc0.C52523w;
import uc0.C52524x;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.f3 */
public class C42985f3 implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ SettingsSelectBgUI f116394d;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.f3$a */
    public class C42986a extends MMHandler {

        /* renamed from: a */
        public final /* synthetic */ C47392i f116395a;

        /* renamed from: b */
        public final /* synthetic */ int f116396b;

        public C42986a(C42985f3 f3Var, C47392i iVar, int i) {
            this.f116395a = iVar;
            this.f116396b = i;
        }

        public void handleMessage(Message message) {
            ((C52524x) this.f116395a).mo73462SE(this.f116396b, 1);
        }
    }

    public C42985f3(SettingsSelectBgUI settingsSelectBgUI) {
        this.f116394d = settingsSelectBgUI;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Class cls = C47389f.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsSelectBgUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        if (i == 0) {
            SettingsSelectBgUI.m46635H7(this.f116394d, -2);
            this.f116394d.f116371d.mo1333o();
            SettingsSelectBgUI settingsSelectBgUI = this.f116394d;
            if (!settingsSelectBgUI.f116375h) {
                settingsSelectBgUI.setResult(-1);
                this.f116394d.finish();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSelectBgUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        } else if (i == 1) {
            SettingsSelectBgUI.m46635H7(this.f116394d, 0);
            this.f116394d.f116371d.mo1333o();
            SettingsSelectBgUI settingsSelectBgUI2 = this.f116394d;
            if (!settingsSelectBgUI2.f116375h) {
                settingsSelectBgUI2.setResult(-1);
                this.f116394d.finish();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSelectBgUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        } else if (!C86709a0.m107535s().mo121147n()) {
            C76701a.makeText((Context) this.f116394d, (int) C0966R.string.iyj, 1).show();
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSelectBgUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        } else {
            C52523w wVar = (C52523w) adapterView.getItemAtPosition(i - 2);
            if (wVar == null) {
                Log.m105920e("MicroMsg.SettingsSelectBgUI", "onItemClick fail, info is null, position = " + i);
                C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSelectBgUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            int i2 = wVar.f146701f;
            if (i2 == 1 || i2 == 2) {
                SettingsSelectBgUI.m46635H7(this.f116394d, wVar.f146696a);
                SettingsSelectBgUI settingsSelectBgUI3 = this.f116394d;
                if (settingsSelectBgUI3.f116375h) {
                    wVar.f146701f = 1;
                    C52524x xVar = (C52524x) ((C47389f) C86312j.m106911c(cls)).mo72331SU();
                    xVar.getClass();
                    xVar.mo73467jo(wVar.f146702g);
                    wVar.f146701f = 1;
                    xVar.mo73463TE(wVar);
                } else {
                    settingsSelectBgUI3.f116371d.mo1333o();
                }
                SettingsSelectBgUI settingsSelectBgUI4 = this.f116394d;
                if (!settingsSelectBgUI4.f116375h) {
                    settingsSelectBgUI4.setResult(-1);
                    this.f116394d.finish();
                }
            } else if (i2 == 3) {
                C47390g gVar = this.f116394d.f116373f;
                if (gVar != null && gVar.mo72417z() == wVar.f146696a) {
                    C86709a0.m107524d().mo123458d((C117747y) this.f116394d.f116373f);
                    ((C52524x) ((C47389f) C86312j.m106911c(cls)).mo72331SU()).mo73462SE(this.f116394d.f116373f.mo72417z(), 1);
                    SettingsSelectBgUI settingsSelectBgUI5 = this.f116394d;
                    settingsSelectBgUI5.mo67185I7(settingsSelectBgUI5.f116374g);
                }
                SettingsSelectBgUI settingsSelectBgUI6 = this.f116394d;
                int i3 = wVar.f146696a;
                List<C47390g> list = settingsSelectBgUI6.f116374g;
                settingsSelectBgUI6.getClass();
                ArrayList arrayList2 = (ArrayList) list;
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C47390g gVar2 = (C47390g) it.next();
                    if (gVar2.mo72417z() == i3) {
                        ((C52524x) ((C47389f) C86312j.m106911c(cls)).mo72331SU()).mo73462SE(gVar2.mo72417z(), 1);
                        arrayList2.remove(gVar2);
                        break;
                    }
                }
                C47392i SU = ((C47389f) C86312j.m106911c(cls)).mo72331SU();
                wVar.f146701f = 4;
                C52524x xVar2 = (C52524x) SU;
                xVar2.mo73463TE(wVar);
                new C42986a(this, xVar2, wVar.f146696a).sendEmptyMessageDelayed(0, 1000);
            } else if (i2 == 4) {
                ((C52524x) ((C47389f) C86312j.m106911c(cls)).mo72331SU()).mo73462SE(wVar.f146696a, 1);
            } else if (i2 == 5) {
                SettingsSelectBgUI settingsSelectBgUI7 = this.f116394d;
                if (settingsSelectBgUI7.f116373f == null) {
                    settingsSelectBgUI7.f116373f = ((C47389f) C86312j.m106911c(cls)).mo72328CV(wVar.f146696a, 1);
                    C86709a0.m107524d().mo123460f((C117747y) this.f116394d.f116373f);
                } else {
                    ((ArrayList) settingsSelectBgUI7.f116374g).add(((C47389f) C86312j.m106911c(cls)).mo72328CV(wVar.f146696a, 1));
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSelectBgUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }
}
