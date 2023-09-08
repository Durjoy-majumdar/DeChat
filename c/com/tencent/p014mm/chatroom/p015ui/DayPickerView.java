package com.tencent.p014mm.chatroom.p015ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import p1123ii.C108463a;
import p1123ii.C108464b;
import p203mi.C109628a;

/* renamed from: com.tencent.mm.chatroom.ui.DayPickerView */
public class DayPickerView extends RecyclerView {

    /* renamed from: A1 */
    public C108463a f310572A1;

    /* renamed from: B1 */
    public TypedArray f310573B1;

    /* renamed from: C1 */
    public RecyclerView.C0130p f310574C1;

    /* renamed from: D1 */
    public Collection<C109628a> f310575D1;

    /* renamed from: E1 */
    public long f310576E1;

    /* renamed from: y1 */
    public Context f310577y1;

    /* renamed from: z1 */
    public C108464b f310578z1;

    public DayPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C108463a getController() {
        return this.f310572A1;
    }

    public C108464b.C108465a<C109628a> getSelectedDays() {
        return this.f310578z1.f324786h;
    }

    public TypedArray getTypedArray() {
        return this.f310573B1;
    }

    public void setBeginDate(long j) {
        this.f310576E1 = j;
    }

    public void setUpAdapter(Collection<C109628a> collection) {
        if (this.f310578z1 == null) {
            this.f310578z1 = new C108464b(getContext(), this.f310572A1, this.f310573B1, this.f310576E1, collection);
        }
    }

    public DayPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f310576E1 = -1;
        if (!isInEditMode()) {
            this.f310573B1 = context.obtainStyledAttributes(attributeSet, C104614k1.f310642a);
            setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
            setLayoutManager(new LinearLayoutManager(context));
            this.f310577y1 = context;
            setVerticalScrollBarEnabled(false);
            setOnScrollListener(this.f310574C1);
            setFadingEdgeLength(0);
            this.f310574C1 = new C1215f0(this);
        }
    }
}
