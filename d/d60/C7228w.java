package d60;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.sdk.platformtools.Util;
import d60.C58124b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import te3.C49317ep2;

/* renamed from: d60.w */
public final class C7228w extends C58121a {

    /* renamed from: f */
    public final C58124b f25288f;

    /* renamed from: g */
    public final EditText f25289g;

    /* renamed from: d60.w$a */
    public static final class C7229a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C7228w f25290d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f25291e;

        public C7229a(C7228w wVar, ViewGroup viewGroup) {
            this.f25290d = wVar;
            this.f25291e = viewGroup;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveDebugPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Editable text = this.f25290d.f25289g.getText();
            if (!Util.isNullOrNil((CharSequence) text)) {
                RoomLiveService roomLiveService = RoomLiveService.f157190a;
                C49317ep2 ep22 = RoomLiveService.f157197h;
                if (ep22 != null) {
                    ep22.f133050d = Long.parseLong(text.toString());
                }
            }
            this.f25291e.setVisibility(8);
            C58124b.C7172a.m7372a(this.f25290d.f25288f, C58124b.C58125b.DEBUG_ENTER, (Bundle) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveDebugPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7228w(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f25288f = bVar;
        EditText editText = (EditText) viewGroup.findViewById(C0966R.C0970id.ivm);
        this.f25289g = editText;
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        C49317ep2 ep22 = RoomLiveService.f157197h;
        editText.setText(String.valueOf(ep22 != null ? Long.valueOf(ep22.f133050d) : null));
        ((Button) viewGroup.findViewById(C0966R.C0970id.ftk)).setOnClickListener(new C7229a(this, viewGroup));
    }
}
