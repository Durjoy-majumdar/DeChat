package com.tencent.p014mm.plugin.label.p067ui.searchLabel;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.CheckBox;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.label.p067ui.ContactEditLabel;
import com.tencent.p014mm.plugin.label.p067ui.ContactLabelEditUI;
import com.tencent.p014mm.plugin.label.p067ui.searchLabel.C69101b;
import com.tencent.p014mm.plugin.label.p067ui.searchLabel.LabelSearchUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72955b2;
import di3.C86312j;
import e22.C75529q0;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C9556a;
import p910lj.C76701a;
import qo3.C77426q;

/* renamed from: com.tencent.mm.plugin.label.ui.searchLabel.a */
public class C69100a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f198700d;

    /* renamed from: e */
    public final /* synthetic */ C72955b2 f198701e;

    /* renamed from: f */
    public final /* synthetic */ C75529q0 f198702f;

    /* renamed from: g */
    public final /* synthetic */ int f198703g;

    /* renamed from: h */
    public final /* synthetic */ C69101b f198704h;

    public C69100a(C69101b bVar, String str, C72955b2 b2Var, C75529q0 q0Var, int i) {
        this.f198704h = bVar;
        this.f198700d = str;
        this.f198701e = b2Var;
        this.f198702f = q0Var;
        this.f198703g = i;
    }

    public void onClick(View view) {
        C72955b2 F4;
        C72955b2 F42;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!this.f198704h.f198708g.contains(this.f198700d) || this.f198704h.f198715q) {
            C69101b bVar = this.f198704h;
            if (bVar.f198717s || bVar.mo95174G4(String.valueOf(this.f198701e.field_labelID)) != 0) {
                C69101b.C69102a aVar = this.f198704h.f198718t;
                View view2 = this.f198702f.f221910B;
                int i = this.f198703g;
                LabelSearchUI.C69097e eVar = (LabelSearchUI.C69097e) aVar;
                LabelSearchUI labelSearchUI = LabelSearchUI.this;
                C69101b bVar2 = labelSearchUI.f198687n;
                if (bVar2 != null && i >= 0) {
                    if ((labelSearchUI.f198682f == 0) && bVar2 != null && i >= 0 && (F42 = bVar2.mo95173F4(i)) != null) {
                        LabelSearchUI labelSearchUI2 = LabelSearchUI.this;
                        String str = F42.field_labelID + "";
                        String str2 = F42.field_labelName;
                        labelSearchUI2.getClass();
                        Intent intent = new Intent();
                        intent.putExtra("label_id", str);
                        intent.putExtra("label_name", str2);
                        intent.putExtra("label_source", "label_source_Address");
                        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_enable_new_contact_label_ui, 1) == 1) {
                            Log.m105924i("MicroMsg.LabelSearchUI", "startActivity ContactEditLabel ");
                            intent.setClass(labelSearchUI2, ContactEditLabel.class);
                        } else {
                            Log.m105924i("MicroMsg.LabelSearchUI", "startActivity ContactLabelEditUI ");
                            intent.setClass(labelSearchUI2, ContactLabelEditUI.class);
                        }
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(intent);
                        LabelSearchUI labelSearchUI3 = labelSearchUI2;
                        C117292a.m165358d(labelSearchUI3, aVar2.mo10232b(), "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI", "startLabelEditUI", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        labelSearchUI2.startActivity((Intent) aVar2.mo10231a(0));
                        C117292a.m165359e(labelSearchUI3, "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI", "startLabelEditUI", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        labelSearchUI2.finish();
                    }
                    LabelSearchUI labelSearchUI4 = LabelSearchUI.this;
                    if ((labelSearchUI4.f198682f == 1) && (F4 = labelSearchUI4.f198687n.mo95173F4(i)) != null) {
                        LabelSearchUI labelSearchUI5 = LabelSearchUI.this;
                        if (!labelSearchUI5.f198685i) {
                            Intent intent2 = new Intent();
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(String.valueOf(F4.field_labelID));
                            LabelSearchUI labelSearchUI6 = LabelSearchUI.this;
                            String string = labelSearchUI6.getResources().getString(C0966R.string.g2i, new Object[]{"" + F4.field_labelName});
                            if (!labelSearchUI6.f198691r) {
                                Log.m105918d("MicroMsg.LabelSearchUI", "showToastBlack: skip");
                            } else {
                                C76701a.makeText((Context) labelSearchUI6, (CharSequence) string, 0).show();
                            }
                            intent2.putExtra("contact_choose_label_list", Util.listToString(arrayList2, ","));
                            LabelSearchUI.this.setResult(-1, intent2);
                            LabelSearchUI.this.finish();
                        } else if ((view2.getTag() instanceof C75529q0) && ((C75529q0) view2.getTag()).f221911C != null) {
                            CheckBox checkBox = ((C75529q0) view2.getTag()).f221911C;
                            if (checkBox.isChecked() || ((LinkedList) labelSearchUI5.f198687n.f198707f).size() < 50) {
                                checkBox.setChecked(!checkBox.isChecked());
                                if (checkBox.isChecked()) {
                                    ((LinkedList) labelSearchUI5.f198687n.f198707f).add(String.valueOf(F4.field_labelID));
                                    ((LinkedList) labelSearchUI5.f198687n.f198706e).add(String.valueOf(F4.field_labelID));
                                } else {
                                    ((LinkedList) labelSearchUI5.f198687n.f198707f).remove(String.valueOf(F4.field_labelID));
                                    ((LinkedList) labelSearchUI5.f198687n.f198706e).remove(String.valueOf(F4.field_labelID));
                                }
                                if (labelSearchUI5.f198685i) {
                                    List<String> list = labelSearchUI5.f198687n.f198707f;
                                    if (list == null || ((LinkedList) list).size() == 0) {
                                        labelSearchUI5.f198692s.setText(labelSearchUI5.getString(C0966R.string.f7929wj));
                                        labelSearchUI5.f198692s.setEnabled(false);
                                    } else {
                                        labelSearchUI5.f198692s.setText(labelSearchUI5.getString(C0966R.string.f7929wj) + "(" + ((LinkedList) labelSearchUI5.f198687n.f198707f).size() + ")");
                                        labelSearchUI5.f198692s.setEnabled(true);
                                    }
                                }
                            } else {
                                C76701a.makeText((Context) labelSearchUI5, (CharSequence) labelSearchUI5.getResources().getString(C0966R.string.g2v), 0).show();
                            }
                        }
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            Log.m105925i("MicroMsg.LabelSearchAdapter", "onClick: forbid choose empty label id:%d", Integer.valueOf(this.f198701e.field_labelID));
            C77426q qVar = new C77426q(this.f198704h.f198710i);
            qVar.mo107595g(this.f198704h.f198710i.getResources().getString(C0966R.string.myq));
            qVar.mo107602n(this.f198704h.f198710i.getResources().getString(C0966R.string.f8028zq));
            qVar.mo107603o();
            C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        Log.m105925i("MicroMsg.LabelSearchAdapter", "onClick: disable labelId:%s", this.f198700d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
