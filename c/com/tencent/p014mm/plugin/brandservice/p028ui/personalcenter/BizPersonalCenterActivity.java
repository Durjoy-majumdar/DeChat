package com.tencent.p014mm.plugin.brandservice.p028ui.personalcenter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.BizPersonalCenterReportStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;
import j20.C117292a;
import java.util.Iterator;
import java.util.LinkedList;
import jx0.C33702b;
import jx0.C46576a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import kw0.C46746a;
import rx3.C36570n;
import sx3.C64197v;
import te3.C51717vo;
import te3.C51859wo;
import te3.C51968xg;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/BizPersonalCenterActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.brandservice.ui.personalcenter.BizPersonalCenterActivity */
public final class BizPersonalCenterActivity extends MMActivity {

    /* renamed from: d */
    public final String f109262d = "MicroMsg.BizPersonalCenterActivity";

    /* renamed from: e */
    public final long f109263e = (System.currentTimeMillis() / ((long) 1000));

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.personalcenter.BizPersonalCenterActivity$a */
    public static final class C40670a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ BizPersonalCenterActivity f109264d;

        public C40670a(BizPersonalCenterActivity bizPersonalCenterActivity) {
            this.f109264d = bizPersonalCenterActivity;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f109264d.finish();
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d3r;
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        Log.m105924i(this.f109262d, "onCreate");
        setMMTitle("");
        setBackBtn(new C40670a(this));
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.ns6);
        C33702b bVar = C33702b.f91166a;
        byte[] decodeBytes = ((MultiProcessMMKV) ((C36570n) C33702b.f91167b).getValue()).decodeBytes("personal_center_main_table");
        C51968xg xgVar = new C51968xg();
        if (decodeBytes != null) {
            xgVar.parseFrom(decodeBytes);
        }
        if ((BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) && MultiProcessMMKV.getMMKV("test_biz_pc").decodeBool("destroy_main_menu")) {
            xgVar.f144636f.clear();
            Log.m105924i(this.f109262d, "debug: destroy_main_menu");
        }
        LinkedList<C51717vo> linkedList = xgVar.f144636f;
        C87412m.m108593f(linkedList, "cellInfoList.dynamic_list");
        Iterator<T> it = linkedList.iterator();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            LinkedList<C51859wo> linkedList2 = ((C51717vo) it.next()).f143600d;
            C87412m.m108593f(linkedList2, "cellGroup.cell_list");
            for (C51859wo woVar : linkedList2) {
                int i2 = woVar.f144163e;
                if (i2 == 1) {
                    z = true;
                } else if (i2 == 6) {
                    z2 = true;
                } else if (i2 == 7) {
                    z3 = true;
                }
            }
        }
        String str = this.f109262d;
        Log.m105924i(str, "myMessageOk = " + z + ", notificationOk = " + z2 + ", settingOk = " + z3);
        if (!z || !z2 || !z3) {
            BizPersonalCenterReportStruct bizPersonalCenterReportStruct = new BizPersonalCenterReportStruct();
            bizPersonalCenterReportStruct.f107854d = 102;
            bizPersonalCenterReportStruct.mo86054n();
            Log.m105928w(this.f109262d, "triggerRedLine!");
            C51717vo voVar = new C51717vo();
            LinkedList<C51859wo> linkedList3 = voVar.f143600d;
            C51859wo woVar2 = new C51859wo();
            woVar2.f144163e = 1;
            woVar2.f144167i = getContext().getResources().getString(C0966R.string.f360194n04);
            woVar2.f144162d = 1;
            linkedList3.add(woVar2);
            C51717vo voVar2 = new C51717vo();
            LinkedList<C51859wo> linkedList4 = voVar2.f143600d;
            C51859wo woVar3 = new C51859wo();
            woVar3.f144163e = 6;
            woVar3.f144167i = getContext().getResources().getString(C0966R.string.n06);
            woVar3.f144162d = 1;
            linkedList4.add(woVar3);
            LinkedList<C51859wo> linkedList5 = voVar2.f143600d;
            C51859wo woVar4 = new C51859wo();
            woVar4.f144163e = 7;
            woVar4.f144167i = getContext().getResources().getString(C0966R.string.n0_);
            woVar4.f144162d = 1;
            linkedList5.add(woVar4);
            LinkedList<C51717vo> linkedList6 = new LinkedList<>();
            linkedList6.add(voVar);
            linkedList6.add(voVar2);
            xgVar.f144636f = linkedList6;
        } else {
            BizPersonalCenterReportStruct bizPersonalCenterReportStruct2 = new BizPersonalCenterReportStruct();
            bizPersonalCenterReportStruct2.f107854d = 101;
            bizPersonalCenterReportStruct2.mo86054n();
        }
        int size = xgVar.f144636f.size();
        int i3 = 0;
        while (i3 < size) {
            C51717vo voVar3 = xgVar.f144636f.get(i3);
            int i4 = -1;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMarginStart(C76577a.m92151b(this, 12));
            layoutParams.setMarginEnd(C76577a.m92151b(this, 12));
            if (i3 > 0) {
                layoutParams.topMargin = C76577a.m92151b(this, 12);
            }
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setOrientation(i);
            linearLayout2.setLayoutParams(layoutParams);
            C46746a.m52038k(C46746a.f125826a, linearLayout2, (float) C76577a.m92151b(this, 8), false, false, 12, (Object) null);
            if (voVar3.f143600d.size() > 0) {
                LinkedList<C51859wo> linkedList7 = voVar3.f143600d;
                C87412m.m108593f(linkedList7, "group.cell_list");
                int i5 = 0;
                for (T next : linkedList7) {
                    int i6 = i5 + 1;
                    if (i5 >= 0) {
                        C51859wo woVar5 = (C51859wo) next;
                        String str2 = this.f109262d;
                        Log.m105924i(str2, "createTable, cellName = " + woVar5.f144163e + ", cellType = " + woVar5.f144162d + ", content = " + woVar5.f144167i + ", url = " + woVar5.f144164f);
                        int size2 = voVar3.f143600d.size();
                        View inflate = LayoutInflater.from(this).inflate(C0966R.C0971layout.d3q, (ViewGroup) null);
                        ((TextView) inflate.findViewById(C0966R.C0970id.ns5)).setText(woVar5.f144167i);
                        View findViewById = inflate.findViewById(C0966R.C0970id.ns4);
                        if (i5 == size2 + i4) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(8);
                            View view = findViewById;
                            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/personalcenter/BizPersonalCenterActivity", "createTableItem", "(Lcom/tencent/mm/protocal/protobuf/CellInfo;II)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/personalcenter/BizPersonalCenterActivity", "createTableItem", "(Lcom/tencent/mm/protocal/protobuf/CellInfo;II)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        } else {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(0);
                            View view2 = findViewById;
                            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/personalcenter/BizPersonalCenterActivity", "createTableItem", "(Lcom/tencent/mm/protocal/protobuf/CellInfo;II)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/brandservice/ui/personalcenter/BizPersonalCenterActivity", "createTableItem", "(Lcom/tencent/mm/protocal/protobuf/CellInfo;II)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        inflate.setOnClickListener(new C46576a(woVar5, this));
                        linearLayout2.addView(inflate);
                        i5 = i6;
                        i4 = -1;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                linearLayout.addView(linearLayout2);
            }
            i3++;
            i = 1;
        }
        BizPersonalCenterReportStruct bizPersonalCenterReportStruct3 = new BizPersonalCenterReportStruct();
        bizPersonalCenterReportStruct3.f107854d = 1;
        bizPersonalCenterReportStruct3.f107855e = 0;
        bizPersonalCenterReportStruct3.f107856f = this.f109263e;
        bizPersonalCenterReportStruct3.mo86054n();
    }

    public void onDestroy() {
        super.onDestroy();
        BizPersonalCenterReportStruct bizPersonalCenterReportStruct = new BizPersonalCenterReportStruct();
        bizPersonalCenterReportStruct.f107854d = 2;
        bizPersonalCenterReportStruct.f107855e = 0;
        bizPersonalCenterReportStruct.f107856f = this.f109263e;
        bizPersonalCenterReportStruct.mo86054n();
    }
}
