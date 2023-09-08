package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.kinda.framework.C67448R;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.picker.base.view.WheelView;
import java.util.ArrayList;
import java.util.List;
import jf0.C21233a;
import lf0.C21425b;
import p385u2.C111105a;

public class KindaPickerViewImpl<T> extends LinearLayout {
    private static final String TAG = "KindaPickerViewImpl";
    private boolean mIsLinkage = true;
    private List<T> mLeftWheelItems;
    /* access modifiers changed from: private */
    public OnSelectChangeListener mOnSelectChangeListener;
    /* access modifiers changed from: private */
    public List<? extends List<T>> mRightWheelItems;
    /* access modifiers changed from: private */
    public WheelView mWheelViewLeft;
    /* access modifiers changed from: private */
    public WheelView mWheelViewRight;

    public interface OnSelectChangeListener {
        void onSelected(ArrayList<Integer> arrayList);
    }

    public KindaPickerViewImpl(Context context) {
        super(context);
        init(context);
    }

    private void forceSetSelectedItems(List<Integer> list) {
        if (list != null && list.size() >= 1) {
            if (this.mLeftWheelItems != null) {
                this.mWheelViewLeft.setCurrentItem(list.get(0).intValue());
            }
            if (this.mRightWheelItems != null && list.size() > 1) {
                this.mWheelViewRight.setAdapter(new C21233a((List) this.mRightWheelItems.get(list.get(0).intValue())));
                this.mWheelViewRight.setCurrentItem(list.get(1).intValue());
            }
        }
    }

    private void init(Context context) {
        C85868k2.m106137b(context).inflate(C67448R.C67450layout.b3h, this);
        this.mWheelViewLeft = (WheelView) findViewById(C67448R.C67449id.hnn);
        this.mWheelViewRight = (WheelView) findViewById(C67448R.C67449id.hno);
        setDividerHeight((float) context.getResources().getDimensionPixelSize(C0966R.dimen.f4175v5));
        setDividerColor(C111105a.m151500b(context, C0966R.color.BW_0_Alpha_0_1));
        setPadding(0, context.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), 0, context.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
        setItemHeight(context.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
        setTextColor(C111105a.m151500b(context, C0966R.color.BW_0_Alpha_0_9));
        setLoop(false);
    }

    public ArrayList<Integer> getCurrentItems() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int currentItem = this.mWheelViewLeft.getCurrentItem();
        int currentItem2 = this.mWheelViewRight.getCurrentItem();
        List<? extends List<T>> list = this.mRightWheelItems;
        if (list != null && list.size() > 0 && currentItem2 > ((List) this.mRightWheelItems.get(currentItem)).size() - 1) {
            currentItem2 = 0;
        }
        arrayList.add(Integer.valueOf(currentItem));
        arrayList.add(Integer.valueOf(currentItem2));
        return arrayList;
    }

    public void setCurrentItems(List<Integer> list) {
        if (list != null && list.size() >= 1) {
            if (this.mIsLinkage) {
                forceSetSelectedItems(list);
                return;
            }
            this.mWheelViewLeft.setCurrentItem(list.get(0).intValue());
            if (list.size() > 1) {
                this.mWheelViewRight.setCurrentItem(list.get(1).intValue());
            }
        }
    }

    public void setDividerColor(int i) {
        this.mWheelViewLeft.setDividerColor(i);
        this.mWheelViewRight.setDividerColor(i);
    }

    public void setDividerHeight(float f) {
        this.mWheelViewLeft.setDividerHeight(f);
        this.mWheelViewRight.setDividerHeight(f);
    }

    public void setIndividualPicker(List<? extends List<T>> list) {
        if (list != null && list.size() >= 1) {
            List list2 = (List) list.get(0);
            List list3 = null;
            if (list.size() > 1) {
                list3 = (List) list.get(1);
            }
            this.mIsLinkage = false;
            this.mWheelViewLeft.setAdapter(new C21233a(list2));
            this.mWheelViewLeft.setCurrentItem(0);
            if (list3 != null) {
                this.mWheelViewRight.setAdapter(new C21233a(list3));
            }
            WheelView wheelView = this.mWheelViewRight;
            wheelView.setCurrentItem(wheelView.getCurrentItem());
            this.mWheelViewLeft.setIsOptions(true);
            this.mWheelViewRight.setIsOptions(true);
            if (this.mOnSelectChangeListener != null) {
                this.mWheelViewLeft.setOnItemSelectedListener(new C21425b() {
                    public void onItemSelected(int i) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(i));
                        arrayList.add(Integer.valueOf(KindaPickerViewImpl.this.mWheelViewRight.getCurrentItem()));
                        if (KindaPickerViewImpl.this.mOnSelectChangeListener != null) {
                            KindaPickerViewImpl.this.mOnSelectChangeListener.onSelected(arrayList);
                        }
                    }
                });
                if (list3 != null) {
                    this.mWheelViewRight.setOnItemSelectedListener(new C21425b() {
                        public void onItemSelected(int i) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Integer.valueOf(KindaPickerViewImpl.this.mWheelViewLeft.getCurrentItem()));
                            arrayList.add(Integer.valueOf(i));
                            if (KindaPickerViewImpl.this.mOnSelectChangeListener != null) {
                                KindaPickerViewImpl.this.mOnSelectChangeListener.onSelected(arrayList);
                            }
                        }
                    });
                }
            }
        }
    }

    public void setItemHeight(int i) {
        WheelView wheelView = this.mWheelViewLeft;
        wheelView.f49141d = i;
        wheelView.invalidate();
        WheelView wheelView2 = this.mWheelViewRight;
        wheelView2.f49141d = i;
        wheelView2.invalidate();
    }

    public void setLinkagePicker(List<T> list, List<? extends List<T>> list2) {
        if (list != null) {
            this.mLeftWheelItems = list;
            this.mRightWheelItems = list2;
            this.mIsLinkage = true;
            this.mWheelViewLeft.setAdapter(new C21233a(list));
            this.mWheelViewLeft.setCurrentItem(0);
            if (this.mLeftWheelItems != null) {
                this.mWheelViewRight.setAdapter(new C21233a((List) this.mRightWheelItems.get(0)));
            }
            WheelView wheelView = this.mWheelViewRight;
            wheelView.setCurrentItem(wheelView.getCurrentItem());
            this.mWheelViewLeft.setOnItemSelectedListener(new C21425b() {
                public void onItemSelected(int i) {
                    if (KindaPickerViewImpl.this.mOnSelectChangeListener != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(i));
                        arrayList.add(0);
                        if (KindaPickerViewImpl.this.mRightWheelItems != null) {
                            KindaPickerViewImpl.this.mWheelViewRight.setAdapter(new C21233a((List) KindaPickerViewImpl.this.mRightWheelItems.get(i)));
                            KindaPickerViewImpl.this.mWheelViewRight.setCurrentItem(0);
                        }
                        KindaPickerViewImpl.this.mOnSelectChangeListener.onSelected(arrayList);
                    }
                }
            });
            if (list2 != null) {
                this.mWheelViewRight.setOnItemSelectedListener(new C21425b() {
                    public void onItemSelected(int i) {
                        if (KindaPickerViewImpl.this.mOnSelectChangeListener != null) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Integer.valueOf(KindaPickerViewImpl.this.mWheelViewLeft.getCurrentItem()));
                            arrayList.add(Integer.valueOf(i));
                            KindaPickerViewImpl.this.mOnSelectChangeListener.onSelected(arrayList);
                        }
                    }
                });
            }
        }
    }

    public void setLoop(boolean z) {
        this.mWheelViewLeft.setCyclic(z);
        this.mWheelViewRight.setCyclic(z);
    }

    public void setOnSelectChangeListener(OnSelectChangeListener onSelectChangeListener) {
        this.mOnSelectChangeListener = onSelectChangeListener;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.mWheelViewLeft.setPadding(i, i2, i3, i4);
        this.mWheelViewRight.setPadding(i, i2, i3, i4);
    }

    public void setTextColor(int i) {
        this.mWheelViewLeft.mo22032e(i);
        this.mWheelViewRight.mo22032e(i);
    }

    public KindaPickerViewImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public KindaPickerViewImpl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    public KindaPickerViewImpl(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context);
    }
}
