package p91;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.reflect.Field;
import java.util.LinkedList;

/* renamed from: p91.c */
public final class C62210c implements C100693b {

    /* renamed from: a */
    public Class<?> f176852a;

    /* renamed from: b */
    public Field f176853b;

    /* renamed from: c */
    public Field f176854c;

    /* renamed from: d */
    public Field f176855d;

    /* renamed from: e */
    public Field f176856e;

    /* renamed from: f */
    public Field f176857f;

    /* renamed from: g */
    public Field f176858g;

    /* renamed from: h */
    public Field f176859h;

    /* renamed from: i */
    public Field f176860i;

    public C62210c() {
        Class<BaseTimeLineItem.BaseViewHolder> cls = BaseTimeLineItem.BaseViewHolder.class;
        try {
            this.f176852a = cls;
            Field declaredField = cls.getDeclaredField("timeLineObject");
            this.f176853b = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = this.f176852a.getDeclaredField("isAd");
            this.f176855d = declaredField2;
            declaredField2.setAccessible(true);
            int i = TimeLineObject.f283892d;
            Field declaredField3 = TimeLineObject.class.getDeclaredField("Id");
            this.f176854c = declaredField3;
            declaredField3.setAccessible(true);
            Field declaredField4 = this.f176852a.getDeclaredField("snsobj");
            this.f176856e = declaredField4;
            declaredField4.setAccessible(true);
            Class<SnsObject> cls2 = SnsObject.class;
            int i2 = SnsObject.f283890d;
            Field declaredField5 = cls2.getDeclaredField("CommentUserList");
            this.f176858g = declaredField5;
            declaredField5.setAccessible(true);
            Field declaredField6 = cls2.getDeclaredField("LikeCount");
            this.f176857f = declaredField6;
            declaredField6.setAccessible(true);
            Field declaredField7 = cls2.getDeclaredField("Username");
            this.f176859h = declaredField7;
            declaredField7.setAccessible(true);
            Field declaredField8 = cls2.getDeclaredField("Nickname");
            this.f176860i = declaredField8;
            declaredField8.setAccessible(true);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public String mo87288a(View view, int i) {
        Object obj;
        Object tag = view.getTag();
        if (tag == null) {
            return null;
        }
        try {
            Field field = this.f176856e;
            if (field == null || (obj = field.get(tag)) == null) {
                return null;
            }
            return (String) this.f176859h.get(obj);
        } catch (Exception e) {
            Log.printErrStackTrace("HABBYGE-MALI.SnsFeedParamCatcher", e, "get feed info error!", new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public void mo87289b(View view, PInt pInt, PInt pInt2, int i) {
        int i2;
        int i3;
        int i4 = 0;
        pInt.value = 0;
        pInt2.value = 0;
        Object tag = view.getTag();
        if (tag != null) {
            try {
                Field field = this.f176856e;
                if (field != null) {
                    Object obj = field.get(tag);
                    if (obj != null) {
                        i3 = ((Integer) this.f176857f.get(obj)).intValue();
                        try {
                            LinkedList linkedList = (LinkedList) this.f176858g.get(obj);
                            if (linkedList != null) {
                                i2 = linkedList.size();
                                i4 = i3;
                                pInt.value = i4;
                                pInt2.value = i2;
                            }
                        } catch (Exception e) {
                            e = e;
                            Log.printErrStackTrace("HABBYGE-MALI.SnsFeedParamCatcher", e, "get feed info error!", new Object[0]);
                            i4 = i3;
                            i2 = 0;
                            pInt.value = i4;
                            pInt2.value = i2;
                        }
                        i4 = i3;
                    }
                    i2 = 0;
                    pInt.value = i4;
                    pInt2.value = i2;
                }
            } catch (Exception e2) {
                e = e2;
                i3 = 0;
                Log.printErrStackTrace("HABBYGE-MALI.SnsFeedParamCatcher", e, "get feed info error!", new Object[0]);
                i4 = i3;
                i2 = 0;
                pInt.value = i4;
                pInt2.value = i2;
            }
        }
    }

    /* renamed from: c */
    public boolean mo87290c(View view, int i) {
        Object tag = view.getTag();
        if (tag == null) {
            return false;
        }
        try {
            if (!this.f176852a.isInstance(tag)) {
                return false;
            }
            return ((Boolean) this.f176855d.get(tag)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    public String mo87291d(int i) {
        return null;
    }

    /* renamed from: e */
    public String mo87292e(View view, int i) {
        Object obj;
        Object tag = view.getTag();
        if (tag == null) {
            return null;
        }
        try {
            if (!this.f176852a.isInstance(tag) || (obj = this.f176853b.get(tag)) == null) {
                return null;
            }
            try {
                return (String) this.f176854c.get(obj);
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.SnsFeedParamCatcher", e, "getFeedParams.feedId: ", new Object[0]);
                return null;
            }
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    public String mo87293f(View view, int i) {
        Object obj;
        Object tag = view.getTag();
        if (tag == null) {
            return null;
        }
        try {
            Field field = this.f176856e;
            if (field == null || (obj = field.get(tag)) == null) {
                return null;
            }
            return (String) this.f176860i.get(obj);
        } catch (Exception e) {
            Log.printErrStackTrace("HABBYGE-MALI.SnsFeedParamCatcher", e, "get feed info error!", new Object[0]);
            return null;
        }
    }

    public void setRecyclerView(RecyclerView recyclerView) {
    }
}
