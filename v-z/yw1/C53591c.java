package yw1;

import com.tencent.p014mm.plugin.game.autogen.chatroom.Color;
import com.tencent.p014mm.plugin.game.autogen.chatroom.MsgContent;
import com.tencent.p014mm.plugin.game.autogen.chatroom.MsgOptions;
import com.tencent.p014mm.plugin.game.commlib.util.C41872f;
import java.util.HashMap;
import java.util.Map;

/* renamed from: yw1.c */
public class C53591c {

    /* renamed from: a */
    public static Map<String, C53592a> f150599a = new HashMap();

    /* renamed from: b */
    public static boolean f150600b = false;

    /* renamed from: c */
    public static String f150601c;

    /* renamed from: d */
    public static final String f150602d = (C41872f.m45392b(C41872f.C41873a.ONE_DAY) + "image/" + "chatroom/");

    /* renamed from: e */
    public static boolean f150603e = false;

    /* renamed from: yw1.c$a */
    public static class C53592a {

        /* renamed from: a */
        public boolean f150604a = false;

        /* renamed from: b */
        public boolean f150605b = false;
    }

    /* renamed from: yw1.c$b */
    public static class C53593b {

        /* renamed from: a */
        public long f150606a = -1;

        /* renamed from: b */
        public long f150607b = 0;

        /* renamed from: c */
        public long f150608c = -1;

        /* renamed from: d */
        public long f150609d = 0;
    }

    /* renamed from: yw1.c$c */
    public enum C53594c {
        KEEP_ALIVE_TYPE_RECEIVE_CHATROOM_MSG,
        KEEP_ALIVE_TYPE_GET_CHATROOM_REALTIME_INFO,
        KEEP_ALIVE_TYPE_GET_MY_CHAT_ROOM
    }

    /* renamed from: yw1.c$d */
    public static class C53595d {

        /* renamed from: a */
        public String f150614a;

        /* renamed from: b */
        public String f150615b;

        /* renamed from: c */
        public int f150616c;

        /* renamed from: d */
        public String f150617d;

        /* renamed from: e */
        public int f150618e;

        /* renamed from: f */
        public MsgOptions f150619f = new MsgOptions();

        /* renamed from: g */
        public MsgContent f150620g = new MsgContent();
    }

    /* renamed from: yw1.c$e */
    public static class C53596e {

        /* renamed from: a */
        public String f150621a;

        /* renamed from: b */
        public int f150622b;

        /* renamed from: c */
        public int f150623c;

        public C53596e(C53597f fVar, String str, int i, int i2) {
            this.f150621a = str;
            this.f150622b = i;
            this.f150623c = i2;
        }
    }

    /* renamed from: yw1.c$f */
    public enum C53597f {
        LOADING
    }

    /* renamed from: yw1.c$g */
    public static class C53598g {

        /* renamed from: a */
        public String f150626a;

        /* renamed from: b */
        public Color f150627b;
    }
}
