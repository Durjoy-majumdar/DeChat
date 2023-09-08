package com.tencent.p014mm.p136ui.chatting.component;

import ak3.C67056a;
import com.tencent.p014mm.p136ui.chatting.component.biz.BizComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C24560g0;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.annotation.Annotation;
import java.util.LinkedList;
import java.util.List;
import p270xi.C53356d;
import p270xi.C91212b;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C64197v;
import yk3.C53530c;

/* renamed from: com.tencent.mm.ui.chatting.component.c0 */
public final class C73447c0 {

    /* renamed from: a */
    public static final List<Class<? extends C53356d>> f215828a = C64197v.m75537f(C73604u2.class, FootComponent.class, BizComponent.class, C73634v3.class, TranslateComponent.class, C44848z.class, TransformComponent.class, MusicComponent.class, C73467e5.class, EmojiComponent.class, ChatroomComponent.class, C73644w4.class, C73497i3.class, VoiceComponent.class, C73655y0.class, C73632v2.class, GetImageComponent.class, C73669z5.class, C73534m4.class, C73474f3.class, TrackRoomComponent.class, C73427b.class, C73601t4.class, LbsComponent.class, C73522l1.class, C73456d1.class, C73572p3.class, C73636v4.class, C73528m1.class, C44847y5.class, C73515k4.class, C73533m3.class, C73631v1.class, C73495i.class, C73481g2.class, C73668z4.class, C73433b4.class, C73491h3.class, GroupToolsComponet.class, GroupTodoComponent.class, C73537m5.class, C73640w1.class, ChattingAppBrandNotifyComponent.class, C73490h2.class, C73415a1.class, RemittanceSearchComponent.class, C73452c4.class, C44815d0.class, C44830j0.class, C44832j1.class, C73658y3.class, C97016l4.class, C73642w3.class, C44825h1.class, C106673s1.class, C106672n3.class, C73471f0.class, C44844u3.class, OpenIMArchiveComponent.class, C19729d.class, C73431b1.class, C53530c.class, C73511k1.class, C19717a5.class, C73413a0.class, C67056a.class, C73663y4.class, C73480g1.class);

    /* renamed from: b */
    public static final C13601g f215829b = C36568h.m40985a(C73449b.f215832d);

    /* renamed from: com.tencent.mm.ui.chatting.component.c0$a */
    public static final class C73448a {

        /* renamed from: a */
        public Class<? extends C53356d> f215830a;

        /* renamed from: b */
        public Class<? extends C53356d> f215831b;

        public C73448a(Class<? extends C53356d> cls, Class<? extends C53356d> cls2) {
            C87412m.m108594g(cls, "clazz");
            C87412m.m108594g(cls2, "instanceClazz");
            this.f215830a = cls;
            this.f215831b = cls2;
        }

        /* renamed from: a */
        public final C53356d mo102398a() {
            Class<? extends C53356d> cls = this.f215831b;
            List<Class<? extends C53356d>> list = C73447c0.f215828a;
            C87412m.m108594g(cls, "clazz");
            try {
                return (C53356d) cls.newInstance();
            } catch (InstantiationException e) {
                Log.printErrStackTrace("ChattingComponentFactory", e, "", new Object[0]);
            } catch (IllegalAccessException e2) {
                Log.printErrStackTrace("ChattingComponentFactory", e2, "", new Object[0]);
            }
            return null;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.c0$b */
    public static final class C73449b extends C87413o implements C32224a<List<? extends C73448a>> {

        /* renamed from: d */
        public static final C73449b f215832d = new C73449b();

        public C73449b() {
            super(0);
        }

        public Object invoke() {
            return C73447c0.m86803a(C73447c0.f215828a);
        }
    }

    /* renamed from: a */
    public static final List<C73448a> m86803a(List<? extends Class<? extends C53356d>> list) {
        C87412m.m108594g(list, "clazzList");
        LinkedList linkedList = new LinkedList();
        for (Class cls : list) {
            if (cls.isAnnotationPresent(C91212b.class)) {
                Annotation annotation = cls.getAnnotation(C91212b.class);
                C87412m.m108592e(annotation, "null cannot be cast to non-null type com.tencent.mm.chatting.component.base.ComponentAnnotation");
                C91212b bVar = (C91212b) annotation;
                if (C87412m.m108589b(C24560g0.m30725a(bVar.exportInterface()), C91212b.C53355a.class)) {
                    linkedList.add(new C73448a(cls, cls));
                } else {
                    linkedList.add(new C73448a(bVar.exportInterface(), cls));
                }
            } else {
                linkedList.add(new C73448a(cls, cls));
            }
        }
        return linkedList;
    }
}
