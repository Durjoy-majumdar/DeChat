package yu2;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import nj3.C76879j;
import yu2.C102923d;

/* renamed from: yu2.f */
public final class C102945f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C102923d f303827d;

    public C102945f(C102923d dVar) {
        this.f303827d = dVar;
    }

    public final void onClick(View view) {
        C102944e0 e0Var;
        int i;
        boolean z;
        String str;
        boolean z2;
        View view2 = view;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerListAdapter$SnsInfoViewHolder$onBind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$onBind$2");
        C102923d dVar = this.f303827d;
        C87412m.m108593f(view2, LocaleUtil.ITALIAN);
        SnsMethodCalculate.markStartTimeMs("access$select", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        dVar.getClass();
        SnsMethodCalculate.markStartTimeMs("select", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        Object tag = view2.getTag(C0966R.C0970id.jrl);
        if (!(tag instanceof Integer)) {
            SnsMethodCalculate.markEndTimeMs("select", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        } else {
            int intValue = ((Number) tag).intValue();
            SnsMethodCalculate.markStartTimeMs("getItemData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            if (intValue >= dVar.getItemCount()) {
                SnsMethodCalculate.markEndTimeMs("getItemData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                e0Var = null;
            } else {
                e0Var = dVar.mo142642P5().get(intValue);
                SnsMethodCalculate.markEndTimeMs("getItemData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            }
            if (e0Var == null) {
                SnsMethodCalculate.markEndTimeMs("select", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            } else {
                int indexOf = dVar.mo142645S5().indexOf(e0Var);
                if (indexOf == -1) {
                    if (dVar.mo142645S5().size() < 9) {
                        dVar.mo142645S5().add(e0Var);
                        indexOf = dVar.mo142645S5().size() - 1;
                        z = false;
                        i = 0;
                    } else {
                        z = true;
                        i = 1;
                    }
                    dVar.notifyItemChanged(intValue);
                } else {
                    if (indexOf != -1) {
                        SnsMethodCalculate.markStartTimeMs("removeSelectedItemWithNotifyChanged", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                        if (indexOf < 0) {
                            SnsMethodCalculate.markEndTimeMs("removeSelectedItemWithNotifyChanged", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            int size = dVar.mo142645S5().size();
                            for (int i2 = indexOf; i2 < size; i2++) {
                                int Q5 = dVar.mo142643Q5(dVar.mo142645S5().get(i2));
                                if (Q5 != -1) {
                                    arrayList2.add(Integer.valueOf(Q5));
                                }
                            }
                            if (dVar.mo142645S5().remove(e0Var) && !dVar.mo142645S5().contains(e0Var)) {
                                Iterator it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    dVar.notifyItemChanged(((Number) it.next()).intValue());
                                }
                            }
                            SnsMethodCalculate.markEndTimeMs("removeSelectedItemWithNotifyChanged", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                        }
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    i = 1;
                }
                if (z) {
                    Context context = dVar.f303785e;
                    Resources resources = context.getResources();
                    if (resources != null) {
                        str = resources.getQuantityString(C0966R.plurals.f7247a4, 9, new Object[]{9});
                    } else {
                        str = null;
                    }
                    C76879j.m92726T(context, str);
                } else {
                    C102923d.C102925b bVar = dVar.f303792o;
                    if (bVar != null) {
                        bVar.mo142650a(dVar.mo142645S5().size(), intValue, indexOf, i);
                    }
                }
                SnsMethodCalculate.markEndTimeMs("select", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            }
        }
        SnsMethodCalculate.markEndTimeMs("access$select", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$onBind$2");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerListAdapter$SnsInfoViewHolder$onBind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
