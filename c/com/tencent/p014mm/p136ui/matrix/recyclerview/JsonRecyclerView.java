package com.tencent.p014mm.p136ui.matrix.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j20.C117292a;
import java.util.ArrayList;
import jm3.C21263a;

/* renamed from: com.tencent.mm.ui.matrix.recyclerview.JsonRecyclerView */
public class JsonRecyclerView extends RecyclerView {

    /* renamed from: A1 */
    public RecyclerView.C16622o f56346A1;

    /* renamed from: y1 */
    public int f56347y1;

    /* renamed from: z1 */
    public float f56348z1;

    /* renamed from: com.tencent.mm.ui.matrix.recyclerview.JsonRecyclerView$a */
    public class C19801a implements RecyclerView.C16622o {
        public C19801a() {
        }

        /* renamed from: c */
        public void mo126c(RecyclerView recyclerView, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/matrix/recyclerview/JsonRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/ui/matrix/recyclerview/JsonRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
        }

        /* renamed from: d */
        public void mo127d(boolean z) {
        }

        /* renamed from: e */
        public boolean mo6022e(RecyclerView recyclerView, MotionEvent motionEvent) {
            int action = motionEvent.getAction() & motionEvent.getActionMasked();
            if (action == 0) {
                JsonRecyclerView.this.f56347y1 = 1;
            } else if (action == 1) {
                JsonRecyclerView.this.f56347y1 = 0;
            } else if (action == 2) {
                JsonRecyclerView jsonRecyclerView = JsonRecyclerView.this;
                if (jsonRecyclerView.f56347y1 >= 2) {
                    float x1 = JsonRecyclerView.m21504x1(jsonRecyclerView, motionEvent);
                    if (Math.abs(x1 - JsonRecyclerView.this.f56348z1) > 0.5f) {
                        JsonRecyclerView jsonRecyclerView2 = JsonRecyclerView.this;
                        jsonRecyclerView2.setTextSize(C21263a.f60066j * (x1 / jsonRecyclerView2.f56348z1));
                        JsonRecyclerView.this.f56348z1 = x1;
                    }
                }
            } else if (action == 5) {
                JsonRecyclerView jsonRecyclerView3 = JsonRecyclerView.this;
                jsonRecyclerView3.f56348z1 = JsonRecyclerView.m21504x1(jsonRecyclerView3, motionEvent);
                JsonRecyclerView.this.f56347y1++;
            } else if (action == 6) {
                JsonRecyclerView.this.f56347y1--;
            }
            return false;
        }
    }

    public JsonRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: x1 */
    public static float m21504x1(JsonRecyclerView jsonRecyclerView, MotionEvent motionEvent) {
        jsonRecyclerView.getClass();
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((double) ((x * x) + (y * y)));
    }

    public void setBracesColor(int i) {
        C21263a.f60065i = i;
    }

    public void setKeyColor(int i) {
        C21263a.f60060d = i;
    }

    public void setScaleEnable(boolean z) {
        if (z) {
            mo17092j0(this.f56346A1);
        } else {
            mo17096l1(this.f56346A1);
        }
    }

    public void setTextSize(float f) {
        if (f < 10.0f) {
            f = 10.0f;
        } else if (f > 30.0f) {
            f = 30.0f;
        }
        if (C21263a.f60066j != f) {
            C21263a.f60066j = f;
        }
    }

    public void setValueBooleanColor(int i) {
        C21263a.f60063g = i;
    }

    public void setValueNullColor(int i) {
        C21263a.f60062f = i;
    }

    public void setValueNumberColor(int i) {
        C21263a.f60062f = i;
    }

    public void setValueTextColor(int i) {
        C21263a.f60061e = i;
    }

    public void setValueUrlColor(int i) {
        C21263a.f60064h = i;
    }

    public JsonRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f56346A1 = new C19801a();
        setLayoutManager(new LinearLayoutManager(getContext()));
    }
}
