package wf1;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import er1.C7919x;
import fy3.C32231t;
import gy3.C87412m;
import gy3.C87413o;
import qo3.C101218e0;
import rx3.C13598b0;

/* renamed from: wf1.i */
public final class C15183i extends C87413o implements C32231t<Activity, Intent, Integer, DialogInterface.OnClickListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C15162a f41342d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15183i(C15162a aVar) {
        super(6);
        this.f41342d = aVar;
    }

    /* renamed from: L */
    public Object mo14122L(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Activity activity = (Activity) obj;
        Intent intent = (Intent) obj2;
        int intValue = ((Number) obj3).intValue();
        DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) obj4;
        DialogInterface.OnClickListener onClickListener2 = (DialogInterface.OnClickListener) obj5;
        DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) obj6;
        C87412m.m108594g(activity, "context");
        C15191k kVar = C15191k.f41360a;
        kVar.mo14128c("154");
        kVar.mo14130e("room_live_start_create_finder", "154");
        boolean z = MultiProcessMMKV.getSingleMMKV("tag_live_core").getBoolean("anchor_verify", false);
        String string = activity.getString(C0966R.string.f360588mn2);
        C87412m.m108593f(string, "context.getString(com.te…ate_finder_account_title)");
        String string2 = z ? activity.getString(C0966R.string.f360586mn0) : activity.getString(C0966R.string.f360587mn1);
        C87412m.m108593f(string2, "if (hasUsedOldChatroomLi…ount_desc2)\n            }");
        C101218e0 e0Var = new C101218e0(activity);
        e0Var.mo140662i(C0966R.C0971layout.cxm);
        C15162a aVar = this.f41342d;
        TextView textView = (TextView) e0Var.f296384g.findViewById(C0966R.C0970id.n75);
        TextView textView2 = (TextView) e0Var.f296384g.findViewById(C0966R.C0970id.n74);
        View findViewById = e0Var.f296384g.findViewById(C0966R.C0970id.apy);
        View findViewById2 = e0Var.f296384g.findViewById(C0966R.C0970id.hll);
        C87412m.m108593f(textView, "titleTv");
        C7919x.m8091a(textView);
        C87412m.m108593f(textView2, "descTv");
        C7919x.m8091a(textView2);
        textView.setText(string);
        textView2.setText(string2);
        findViewById.setOnClickListener(new C15177f(onClickListener2, e0Var));
        findViewById2.setOnClickListener(new C15179g(intent, aVar, activity, intValue, onClickListener, e0Var));
        e0Var.mo140665l(new C15181h(onDismissListener));
        e0Var.mo140655A();
        return C13598b0.f38549a;
    }
}
