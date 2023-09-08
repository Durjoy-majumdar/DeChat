package com.tencent.p014mm.chatroom.p015ui;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.C44661m1;
import gy3.C87412m;

/* renamed from: com.tencent.mm.chatroom.ui.t1 */
public final class C40266t1 extends RecyclerView.C16631z {

    /* renamed from: A */
    public C44661m1 f108279A;

    /* renamed from: B */
    public ImageView f108280B;

    /* renamed from: C */
    public TextView f108281C;

    /* renamed from: z */
    public final Context f108282z;

    /* renamed from: com.tencent.mm.chatroom.ui.t1$a */
    public interface C40267a {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40266t1(Context context, C44661m1 m1Var, View view, C40267a aVar) {
        super(view);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(view, "itemView");
        this.f108282z = context;
        this.f108279A = m1Var;
        this.f108280B = (ImageView) view.findViewById(C0966R.C0970id.iwa);
        this.f108281C = (TextView) view.findViewById(C0966R.C0970id.bpg);
    }
}
