package ks1;

import android.widget.TextView;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;

/* renamed from: ks1.c */
public final class C61154c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C61150a f174100d;

    /* renamed from: e */
    public final /* synthetic */ FinderObject f174101e;

    public C61154c(C61150a aVar, FinderObject finderObject) {
        this.f174100d = aVar;
        this.f174101e = finderObject;
    }

    public final void run() {
        C61150a aVar = this.f174100d;
        TextView textView = aVar.f174090c;
        FinderObject finderObject = this.f174101e;
        aVar.getClass();
        FinderObjectDesc finderObjectDesc = finderObject.objectDesc;
        String str = finderObjectDesc != null ? finderObjectDesc.description : null;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
    }
}
