package mz2;

import b03.C39718p;
import com.tencent.tav.coremedia.TimeUtil;
import gy3.C87412m;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import jq3.C9493c;
import rz2.C48201c;
import uz2.C52673c1;

/* renamed from: mz2.c */
public final class C47150c implements C9493c {

    /* renamed from: d */
    public List<C52673c1> f126668d;

    /* renamed from: e */
    public List<String> f126669e = new LinkedList();

    /* renamed from: f */
    public List<String> f126670f = new LinkedList();

    /* renamed from: g */
    public String f126671g;

    /* renamed from: h */
    public List<C48201c> f126672h = new LinkedList();

    /* renamed from: i */
    public long f126673i;

    /* renamed from: j */
    public List<String> f126674j = new LinkedList();

    public C47150c(List<C52673c1> list) {
        this.f126668d = list;
        mo72236a();
    }

    /* renamed from: a */
    public final void mo72236a() {
        String str;
        List<C52673c1> list = this.f126668d;
        boolean z = true;
        if (list != null) {
            for (C52673c1 c1Var : list) {
                C48201c a = C47149b.m52432a(c1Var);
                this.f126672h.add(a);
                List<String> list2 = this.f126669e;
                String str2 = a.field_IconID;
                C87412m.m108593f(str2, "item.field_IconID");
                list2.add(str2);
                String str3 = a.field_backgroundId;
                if (str3 == null || str3.length() == 0) {
                    List<String> list3 = this.f126670f;
                    switch (C39718p.f106569a.mo62353d()) {
                        case 1:
                            str = "text_state_default_image_1";
                            break;
                        case 2:
                            str = "text_state_default_image_2";
                            break;
                        case 3:
                            str = "text_state_default_image_3";
                            break;
                        case 4:
                            str = "text_state_default_image_4";
                            break;
                        case 5:
                            str = "text_state_default_image_5";
                            break;
                        case 6:
                            str = "text_state_default_image_6";
                            break;
                        case 7:
                            str = "text_state_default_image_7";
                            break;
                        case 8:
                            str = "text_state_default_image_8";
                            break;
                        case 9:
                            str = "text_state_default_image_9";
                            break;
                        case 10:
                            str = "text_state_default_image_10";
                            break;
                        case 12:
                            str = "text_state_default_image_12";
                            break;
                        default:
                            str = "text_state_default_image_11";
                            break;
                    }
                    list3.add(str);
                } else {
                    List<String> list4 = this.f126670f;
                    String str4 = a.field_backgroundId;
                    C87412m.m108593f(str4, "item.field_backgroundId");
                    list4.add(str4);
                }
                String str5 = c1Var.f147067d;
                if (str5 != null) {
                    List<String> list5 = this.f126674j;
                    C87412m.m108593f(str5, "it.text_status_id");
                    list5.add(str5);
                } else {
                    this.f126674j.add("");
                }
            }
        }
        List<C52673c1> list6 = this.f126668d;
        if (!(list6 == null || list6.isEmpty())) {
            List<C52673c1> list7 = this.f126668d;
            C87412m.m108591d(list7);
            this.f126673i = list7.get(0).f147073j;
        }
        List<C48201c> list8 = this.f126672h;
        if (list8 != null && !list8.isEmpty()) {
            z = false;
        }
        if (!z) {
            long j = ((long) this.f126672h.get(0).field_CreateTime) * ((long) 1000);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(TimeUtil.YYYY2MM2DD_HH1MM1SS);
            Date parse = simpleDateFormat.parse(simpleDateFormat.format(Long.valueOf(j)));
            Calendar instance = Calendar.getInstance();
            instance.setTime(parse);
            this.f126671g = String.valueOf(instance.get(5));
        }
    }

    /* renamed from: c */
    public int mo75c() {
        return 0;
    }

    public long getItemId() {
        return (long) hashCode();
    }
}
