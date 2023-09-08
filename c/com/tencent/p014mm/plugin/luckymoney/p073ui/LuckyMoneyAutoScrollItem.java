package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Context;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollItem */
public class LuckyMoneyAutoScrollItem extends ListView {

    /* renamed from: j */
    public static SparseArray<Integer> f199629j;

    /* renamed from: d */
    public Context f199630d;

    /* renamed from: e */
    public long f199631e;

    /* renamed from: f */
    public int f199632f;

    /* renamed from: g */
    public int f199633g;

    /* renamed from: h */
    public CountDownTimer f199634h;

    /* renamed from: i */
    public C69336c f199635i;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollItem$a */
    public class C69332a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f199636d;

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollItem$a$a */
        public class C69333a extends CountDownTimer {
            public C69333a(long j, long j2) {
                super(j, j2);
            }

            public void onFinish() {
                C69336c cVar = LuckyMoneyAutoScrollItem.this.f199635i;
                if (cVar != null) {
                    LuckyMoneyAutoScrollView luckyMoneyAutoScrollView = (LuckyMoneyAutoScrollView) cVar;
                    if (!luckyMoneyAutoScrollView.f199658x) {
                        luckyMoneyAutoScrollView.f199658x = true;
                        MMHandlerThread.postToMainThread(new C69580d(luckyMoneyAutoScrollView));
                    }
                }
            }

            public void onTick(long j) {
                LuckyMoneyAutoScrollItem luckyMoneyAutoScrollItem = LuckyMoneyAutoScrollItem.this;
                int i = luckyMoneyAutoScrollItem.f199633g + 1;
                luckyMoneyAutoScrollItem.f199633g = i;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                LuckyMoneyAutoScrollItem luckyMoneyAutoScrollItem2 = luckyMoneyAutoScrollItem;
                C117292a.m165358d(luckyMoneyAutoScrollItem2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyAutoScrollItem$1$1", "onTick", "(J)V", "Undefined", "smoothScrollToPosition", "(I)V");
                luckyMoneyAutoScrollItem.smoothScrollToPosition(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(luckyMoneyAutoScrollItem2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyAutoScrollItem$1$1", "onTick", "(J)V", "Undefined", "smoothScrollToPosition", "(I)V");
            }
        }

        public C69332a(long j) {
            this.f199636d = j;
        }

        public void run() {
            LuckyMoneyAutoScrollItem.this.f199634h = new C69333a(this.f199636d, 50).start();
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollItem$b */
    public class C69334b extends BaseAdapter {

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollItem$b$a */
        public class C69335a {

            /* renamed from: a */
            public ImageView f199640a;

            public C69335a(C69334b bVar) {
            }
        }

        public C69334b(C69332a aVar) {
        }

        public int getCount() {
            return 2147483646;
        }

        public Object getItem(int i) {
            return Integer.valueOf(i % 10);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C69335a aVar;
            if (view == null || view.getTag() == null) {
                view = LayoutInflater.from(LuckyMoneyAutoScrollItem.this.f199630d).inflate(C0966R.C0971layout.b9_, (ViewGroup) null);
                aVar = new C69335a(this);
                aVar.f199640a = (ImageView) view.findViewById(C0966R.C0970id.kie);
                view.setTag(aVar);
            } else {
                aVar = (C69335a) view.getTag();
            }
            aVar.f199640a.setImageResource(LuckyMoneyAutoScrollItem.f199629j.get(i % 10).intValue());
            return view;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollItem$c */
    public interface C69336c {
    }

    static {
        SparseArray<Integer> sparseArray = new SparseArray<>();
        f199629j = sparseArray;
        sparseArray.put(0, Integer.valueOf(C0966R.C0969drawable.c95));
        f199629j.put(1, Integer.valueOf(C0966R.C0969drawable.c96));
        f199629j.put(2, Integer.valueOf(C0966R.C0969drawable.c97));
        f199629j.put(3, Integer.valueOf(C0966R.C0969drawable.c98));
        f199629j.put(4, Integer.valueOf(C0966R.C0969drawable.c99));
        f199629j.put(5, Integer.valueOf(C0966R.C0969drawable.c9_));
        f199629j.put(6, Integer.valueOf(C0966R.C0969drawable.c9a));
        f199629j.put(7, Integer.valueOf(C0966R.C0969drawable.c9b));
        f199629j.put(8, Integer.valueOf(C0966R.C0969drawable.c9c));
        f199629j.put(9, Integer.valueOf(C0966R.C0969drawable.c9d));
    }

    public LuckyMoneyAutoScrollItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f199631e = 900;
        this.f199632f = 0;
        this.f199633g = 0;
        this.f199635i = null;
        this.f199630d = context;
        setAdapter(new C69334b((C69332a) null));
        Log.m105925i("MicroMsg.LuckyMoneyAutoScrollView", "hy: scroll height is: %d", Integer.valueOf((int) ((this.f199630d.getResources().getDisplayMetrics().density * 60.0f) + 0.5f)));
    }

    public static void setResouceMap(SparseArray<Integer> sparseArray) {
        f199629j.clear();
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            f199629j.put(keyAt, sparseArray.get(keyAt));
        }
    }

    /* renamed from: b */
    public void mo95501b() {
        CountDownTimer countDownTimer = this.f199634h;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        MMHandlerThread.postToMainThread(new C69332a(((long) (this.f199632f * 50)) + this.f199631e));
    }

    public void setFinalNumber(int i) {
        this.f199632f = i;
    }

    public void setOnScrollEndListener(C69336c cVar) {
        this.f199635i = cVar;
    }

    public void setScrollTime(long j) {
        this.f199631e = j;
    }

    public LuckyMoneyAutoScrollItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
