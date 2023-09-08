package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.widget.AbsListView;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import c81.C0436u;
import c81.C39925s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d81.C20448c;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import kr0.C76629w0;
import org.json.JSONException;
import org.json.JSONObject;
import rx3.C13598b0;
import te3.pa4;
import yk3.C53531d;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.h0 */
public class C41330h0 implements AbsListView.OnScrollListener {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceProfileUI f111304d;

    public C41330h0(ExdeviceProfileUI exdeviceProfileUI) {
        this.f111304d = exdeviceProfileUI;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        C13598b0 b0Var;
        int i4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        arrayList.add(Integer.valueOf(i3));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI$17", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        ExdeviceProfileUI.m44680I7(this.f111304d);
        C0436u uVar = (C0436u) C39818r.f106831a.mo62444c(this.f111304d.getContext()).mo75002a(C0436u.class);
        ExdeviceProfileUI exdeviceProfileUI = this.f111304d;
        String str = exdeviceProfileUI.f111174e;
        LinkedList<LinkedList<pa4>> linkedList = exdeviceProfileUI.f111184r.f111407g;
        uVar.getClass();
        C87412m.m108594g(str, "userName");
        if (linkedList != null) {
            int i5 = i2;
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = i + i6;
                C39622i0 a = C39818r.f106831a.mo62444c(uVar.getActivity()).mo75002a(C53531d.class);
                C87412m.m108593f(a, "UICProvider.of(activity)…MsgReportUIC::class.java)");
                C53531d dVar = (C53531d) a;
                if (i7 <= linkedList.size() - 1) {
                    LinkedList<pa4> linkedList2 = linkedList.get(i7);
                    C87412m.m108593f(linkedList2, "dataList.get(position)");
                    Object obj = linkedList2.get(0);
                    C87412m.m108593f(obj, "list[0]");
                    pa4 pa4 = (pa4) obj;
                    if (!dVar.mo74203d3().contains(String.valueOf(i7))) {
                        int i8 = pa4.f139686o;
                        if (i8 != 0) {
                            i4 = i7;
                            if (i8 == 1) {
                                try {
                                    int i9 = !Util.isNullOrNil(new JSONObject(pa4.f139684j).optString("finder_username")) ? 1 : 2;
                                    C20448c cVar = C20448c.f57466a;
                                    String str2 = pa4.f139679e;
                                    C87412m.m108593f(str2, "sportRecord.appName");
                                    cVar.mo31991a(2, 2, str2, i9, 2, str);
                                } catch (JSONException e) {
                                    Log.printErrStackTrace("SportScrollReportUIC", e, "SportScrollReportUIC", new Object[0]);
                                }
                            }
                        } else if (C87412m.m108589b("21f9d636b41b25be", pa4.f139678d)) {
                            i4 = i7;
                            C20448c.f57466a.mo31991a(2, 1, uVar.getString(C0966R.string.jm4), 2, 2, str);
                        } else {
                            i4 = i7;
                            ((C76629w0) C86312j.m106911c(C76629w0.class)).Ws0(pa4.f139678d, new C39925s(2, str));
                        }
                        dVar.mo74203d3().add(String.valueOf(i4));
                    } else {
                        Log.m105919d("SportScrollReportUIC", "handleScrollReport:contanins %s", Integer.valueOf(i7));
                    }
                }
            }
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Log.m105928w("SportScrollReportUIC", "handleScrollReport: dataList is null");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI$17", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI$17", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI$17", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
