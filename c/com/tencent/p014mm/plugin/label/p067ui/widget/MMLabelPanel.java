package com.tencent.p014mm.plugin.label.p067ui.widget;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.base.MMTagPanel;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.label.ui.widget.MMLabelPanel */
public class MMLabelPanel extends MMTagPanel {

    /* renamed from: J */
    public Context f198736J;

    /* renamed from: K */
    public boolean f198737K = false;

    /* renamed from: L */
    public boolean f198738L = false;

    /* renamed from: M */
    public MMTagPanel.C73208l f198739M;

    /* renamed from: N */
    public MMTagPanel.C73208l f198740N;

    /* renamed from: P */
    public C69108a f198741P;

    /* renamed from: Q */
    public C69108a f198742Q;

    /* renamed from: com.tencent.mm.plugin.label.ui.widget.MMLabelPanel$a */
    public interface C69108a {
    }

    public MMLabelPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo95197w(context);
    }

    /* renamed from: c */
    public String mo95184c(EditText editText, Editable editable, String str, TextWatcher textWatcher) {
        int c;
        editText.removeTextChangedListener(textWatcher);
        if (this.f214920F > 0) {
            if (editable != null) {
                String obj = editable.toString();
                if (!Util.isNullOrNil(obj)) {
                    int f = C45078p0.m49927f(obj);
                    C45078p0.m49925d(this.f214920F, obj);
                    int i = this.f214920F;
                    if (f > i && (c = C45078p0.m49924c(i, obj)) > 0 && c < this.f214920F && c < obj.length()) {
                        editText.setText(obj.substring(0, c + 1));
                        editText.setSelection(editText.getText().length());
                    }
                }
            }
            str = editText.getText() != null ? editText.getText().toString() : "";
        }
        editText.addTextChangedListener(textWatcher);
        return str;
    }

    /* renamed from: d */
    public void mo95185d(String str, boolean z) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.Label.MMLabelPanel", "addTag, want to add tag, but it is null or empty");
            return;
        }
        String trim = str.trim();
        Log.m105919d("MicroMsg.Label.MMLabelPanel", "addTag, want to add tag %s, do remove tag first", trim);
        mo101812o(trim);
        Iterator<MMTagPanel.C73208l> it = this.f214939z.iterator();
        while (it.hasNext()) {
            if (trim.equals(it.next().f214966a)) {
                Log.m105929w("MicroMsg.Label.MMLabelPanel", "addTag, want to add tag %s, but it exsited!", trim);
                return;
            }
        }
        MMTagPanel.C73208l i = mo101808i();
        mo101815s(i, trim, z);
        if (this.f214926j) {
            addView(i.f214967b, getChildCount() - 1);
        } else {
            addView(i.f214967b);
        }
        this.f214939z.add(i);
        mo101807h();
    }

    public int getEditViewLayoutId() {
        return C0966R.C0971layout.bcp;
    }

    public ArrayList<String> getSelectTagList() {
        TextView textView;
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<MMTagPanel.C73208l> it = this.f214939z.iterator();
        while (it.hasNext()) {
            MMTagPanel.C73208l next = it.next();
            if (!(next == null || next == this.f198740N || next == this.f198739M || Util.isNullOrNil(next.f214966a) || (textView = next.f214967b) == null || ((Integer) textView.getTag()).intValue() != 1)) {
                arrayList.add(next.f214966a);
            }
        }
        return arrayList;
    }

    public ArrayList<String> getTagListWithIcon() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<MMTagPanel.C73208l> it = this.f214939z.iterator();
        while (it.hasNext()) {
            MMTagPanel.C73208l next = it.next();
            if (!(Util.isNullOrNil(next.f214966a) || next == this.f198740N || next == this.f198739M)) {
                arrayList.add(next.f214966a);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public TextView mo95189j() {
        TextView j = super.mo95189j();
        j.setPadding(C76577a.m92150a(this.f198736J, 12.0f), C76577a.m92150a(this.f198736J, 5.0f), C76577a.m92150a(this.f198736J, 12.0f), C76577a.m92150a(this.f198736J, 6.0f));
        j.setGravity(17);
        j.setMinHeight(C76577a.m92150a(this.f198736J, 32.0f));
        j.setTextSize(0, (float) C76577a.m92155f(this.f198736J, C0966R.dimen.ak6));
        return j;
    }

    /* renamed from: m */
    public void mo94842m() {
        Log.m105918d("MicroMsg.Label.MMLabelPanel", "cpan[onPreDelTag]");
        getTagCount();
    }

    /* renamed from: q */
    public void mo95190q(Collection<String> collection, List<String> list) {
        boolean z;
        View view;
        mo82020e();
        if (this.f214926j) {
            addView(this.f214918D);
        }
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (true) {
                boolean z2 = false;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (collection != null) {
                    z2 = collection.contains(next);
                }
                mo95185d(next, z2);
            }
            if (this.f198738L) {
                Log.m105924i("MicroMsg.Label.MMLabelPanel", "setTagListByTagName, needNewLebal.");
                addView(this.f198740N.f214968c);
            }
            if (this.f198737K) {
                Log.m105924i("MicroMsg.Label.MMLabelPanel", "setTagListByTagName, needGotoMorePage.");
                addView(this.f198739M.f214968c);
            }
            Iterator<MMTagPanel.C73208l> it4 = this.f214939z.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    z = false;
                    break;
                }
                MMTagPanel.C73208l next2 = it4.next();
                if (next2 != this.f198739M && next2 != this.f198740N) {
                    z = true;
                    break;
                }
            }
            if (this.f198737K && (view = this.f198739M.f214968c) != null) {
                if (!z) {
                    Log.m105924i("MicroMsg.Label.MMLabelPanel", "setTagListByTagName, tags.isEmpty.");
                    View view2 = this.f198739M.f214968c;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/label/ui/widget/MMLabelPanel", "checkMoreViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/label/ui/widget/MMLabelPanel", "checkMoreViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = view;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/label/ui/widget/MMLabelPanel", "checkMoreViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/label/ui/widget/MMLabelPanel", "checkMoreViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (this.f198738L) {
            Log.m105924i("MicroMsg.Label.MMLabelPanel", "setTagListByTagName, tags is null, needNewLebal.");
            addView(this.f198740N.f214968c);
        }
    }

    public void setClickDetailCallBack(C69108a aVar) {
        this.f198741P = aVar;
    }

    public void setClickNewLebalCallBack(C69108a aVar) {
        this.f198742Q = aVar;
    }

    public void setMaxLineSize(int i) {
    }

    public void setNeedAddLastItemToMove(boolean z) {
        this.f198737K = z;
    }

    public void setNeedNewLebal(boolean z) {
        this.f198738L = z;
    }

    /* renamed from: v */
    public void mo95196v(String str, boolean z, int i) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.Label.MMLabelPanel", "addTag2, want to add tag, but it is null or empty");
            return;
        }
        String trim = str.trim();
        Log.m105919d("MicroMsg.Label.MMLabelPanel", "addTag2,want to add tag %s, do remove tag first", trim);
        mo101812o(trim);
        Iterator<MMTagPanel.C73208l> it = this.f214939z.iterator();
        while (it.hasNext()) {
            if (trim.equals(it.next().f214966a)) {
                Log.m105929w("MicroMsg.Label.MMLabelPanel", "addTag2,want to add tag %s, but it exsited!", trim);
                return;
            }
        }
        MMTagPanel.C73208l i2 = mo101808i();
        mo101815s(i2, trim, z);
        addView(i2.f214967b, i);
        this.f214939z.add(i2);
        mo101807h();
    }

    /* renamed from: w */
    public final void mo95197w(Context context) {
        this.f198736J = context;
        this.f198739M = mo101808i();
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f7081xn, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.eqc);
        inflate.setOnClickListener(new C69109a(this));
        if (this.f198739M != null) {
            imageView.setImageDrawable(C74933u4.m89768e(this.f198736J, C0966R.raw.icons_outlined_more, C76577a.m92153d(getContext(), C0966R.color.BW_70)));
        }
        this.f198739M.f214967b.setText("");
        this.f198739M.f214968c = inflate;
        this.f198740N = mo101808i();
        View inflate2 = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f7080xm, (ViewGroup) null);
        ((ImageView) inflate2.findViewById(C0966R.C0970id.f358836hb1)).setImageDrawable(C74933u4.m89768e(this.f198736J, C0966R.raw.icons_filled_add, C76577a.m92153d(getContext(), C0966R.color.BW_70)));
        inflate2.setOnClickListener(new C69110b(this));
        this.f198740N.f214968c = inflate2;
        this.f198739M.f214967b.setText("");
        setTagNormalBG(C0966R.C0969drawable.auf);
        setTagSelectedBG(C0966R.C0969drawable.aug);
        setTagNormalTextColorRes(C0966R.color.FG_2);
        setTagSelectedTextColorRes(C0966R.color.f3277lw);
        setHintTextSize(C76577a.m92155f(context, C0966R.dimen.ak6));
    }

    public MMLabelPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo95197w(context);
    }
}
