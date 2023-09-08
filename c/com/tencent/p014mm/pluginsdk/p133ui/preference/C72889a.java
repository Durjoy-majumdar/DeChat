package com.tencent.p014mm.pluginsdk.p133ui.preference;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.plugin.profile.C42599h;
import com.tencent.p014mm.plugin.profile.NewContactWidgetNormal;
import com.tencent.p014mm.pluginsdk.p133ui.preference.C72893b;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import qn3.C77382c;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.pluginsdk.ui.preference.a */
public class C72889a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C72893b f212454d;

    /* renamed from: com.tencent.mm.pluginsdk.ui.preference.a$a */
    public class C72890a implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ TextView f212455d;

        public C72890a(C72889a aVar, TextView textView) {
            this.f212455d = textView;
        }

        public void afterTextChanged(Editable editable) {
            int b = C45078p0.m49923b(100, editable.toString());
            TextView textView = this.f212455d;
            if (textView != null) {
                textView.setText(String.valueOf(b));
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.preference.a$b */
    public class C72891b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EditText f212456d;

        public C72891b(EditText editText) {
            this.f212456d = editText;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String trim = this.f212456d.getText().toString().trim();
            if (trim != null && trim.length() > 0) {
                try {
                    C72893b.m85478a(C72889a.this.f212454d, trim);
                    Context context = C72889a.this.f212454d.f212460d;
                    if (context instanceof Activity) {
                        C42599h.xx0(((Activity) context).getIntent(), 29, 1, C72893b.f212459i.f212466a);
                        C72893b.C72896c cVar = C72889a.this.f212454d.f212464h;
                        if (cVar != null) {
                            NewContactWidgetNormal newContactWidgetNormal = NewContactWidgetNormal.this;
                            newContactWidgetNormal.mo96531b(2, newContactWidgetNormal.f202419d);
                        }
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    Log.printErrStackTrace("MicroMsg.FMessageItemView", e, "", new Object[0]);
                    C89779i0 i0Var = C72889a.this.f212454d.f212463g;
                    if (i0Var != null && i0Var.isShowing()) {
                        C72889a.this.f212454d.f212463g.dismiss();
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.preference.a$c */
    public class C72892c implements Runnable {
        public C72892c() {
        }

        public void run() {
            Context context = C72889a.this.f212454d.f212460d;
            if (context instanceof MMActivity) {
                ((MMActivity) context).showVKB();
            }
        }
    }

    public C72889a(C72893b bVar) {
        this.f212454d = bVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/preference/FMessageItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        View inflate = View.inflate(this.f212454d.f212460d, C0966R.C0971layout.bwo, (ViewGroup) null);
        ((TextView) inflate.findViewById(C0966R.C0970id.jc8)).setVisibility(8);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.lr4);
        textView.setVisibility(0);
        textView.setText(String.valueOf(50));
        EditText editText = (EditText) inflate.findViewById(C0966R.C0970id.jc7);
        editText.setSingleLine(false);
        C77382c b = C77382c.m93286b(editText);
        b.f225611e = 0;
        b.f225610d = 100;
        b.mo107499d((C77382c.C77383a) null);
        editText.addTextChangedListener(new C72890a(this, textView));
        Context context = this.f212454d.f212460d;
        if (context instanceof Activity) {
            C42599h.xx0(((Activity) context).getIntent(), 28, 1, C72893b.f212459i.f212466a);
        }
        Context context2 = this.f212454d.f212460d;
        C76879j.m92753x(context2, context2.getString(C0966R.string.a2h), (String) null, inflate, new C72891b(editText), (DialogInterface.OnClickListener) null);
        editText.post(new C72892c());
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/preference/FMessageItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
