package te0;

import android.content.Context;
import android.content.DialogInterface;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ie0.C46220j;
import ie0.C46225p;
import ie0.C46232y;
import nj3.C76879j;
import qe0.C47806g;
import qo3.C12925w;
import vd3.C78391d;

/* renamed from: te0.m */
public final class C48639m {

    /* renamed from: a */
    public static final C48639m f130178a = new C48639m();

    /* renamed from: a */
    public static final void m54059a(C48639m mVar, boolean z, C12925w wVar) {
        mVar.getClass();
        Context context = wVar.f36927f.getContext();
        if (z) {
            wVar.f36933o = false;
            wVar.mo5085n();
            return;
        }
        C76879j.m92711E(context, context.getString(C0966R.string.m8c), "", context.getString(C0966R.string.m8b), false, (DialogInterface.OnClickListener) null);
    }

    /* renamed from: b */
    public final void mo73334b(Context context, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "talkUsername");
        C12925w wVar = new C12925w(context);
        wVar.mo12470j(C0966R.C0971layout.cr7);
        ViewGroup viewGroup = wVar.f36921B;
        ImageView imageView = (ImageView) viewGroup.findViewById(C0966R.C0970id.m59);
        TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.m5a);
        TextView textView2 = (TextView) viewGroup.findViewById(C0966R.C0970id.m5c);
        Button button = (Button) viewGroup.findViewById(C0966R.C0970id.m5b);
        Button button2 = (Button) viewGroup.findViewById(C0966R.C0970id.m58);
        TextView textView3 = (TextView) viewGroup.findViewById(C0966R.C0970id.m5_);
        C46232y yVar = C46232y.f124619d;
        C46220j b = C46225p.m51524b(str);
        if (b != null) {
            C78391d.C78393b.m94669a(imageView, b.field_username);
            textView.setText(b.field_nickname);
            textView2.setText(C47806g.m53117b(b.mo71631V()));
            wVar.mo5086o();
            textView3.setOnClickListener(new C13876i(viewGroup));
            button.setOnClickListener(new C48633j(viewGroup, b, wVar));
            button2.setOnClickListener(new C48635k(viewGroup, b, wVar));
            return;
        }
        Log.m105921e("MicroMsg.OpenIMKefuLocReqDialog", "%s maybe is wrong? getContactFromLocal return null", str);
    }
}
