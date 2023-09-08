package com.tencent.p014mm.plugin.finder.storage;

import android.content.Context;
import android.database.Cursor;
import android.text.SpannableString;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.IXWebBroadcastListener;
import di3.C7335d;
import di3.C86312j;
import eb0.C31543z5;
import er1.C58739j4;
import er1.C58773q5;
import er1.C7823k0;
import er1.C7840n;
import fe1.C58960c;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import ht1.C60216z4;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import ls3.C61397g;
import o40.C61926c;
import o40.C61937h;
import p565ir.C60606n;
import p629ny.C76979h;
import p749xh.C66261f3;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C64186f0;
import sx3.C64197v;
import te3.C48872bl0;
import te3.C49040cr0;
import te3.C50124kf1;
import te3.C50271lj0;
import te3.C50435mq0;
import te3.C51235sf0;
import te3.C51388tf0;
import te3.C52192z0;
import te3.C64267br2;
import te3.C64273c21;
import te3.C64284cg;
import te3.C64311db1;
import te3.C64337e61;
import te3.C64394ge0;
import te3.C64472jk0;
import te3.C64475jq0;
import te3.C64532lq2;
import te3.C64689rq2;
import te3.C64736tq2;
import te3.C64783vq0;
import te3.C64827xe1;
import te3.C64850yb1;
import tf0.C64916p1;
import yr3.C79150a;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\bE\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 È\u00022\u00020\u00012\u00020\u0002:\u0002É\u0002B\t¢\u0006\u0006\bÆ\u0002\u0010Ç\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\tJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u0010J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u000bJ\u0006\u0010\u001a\u001a\u00020\tJ\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001bJ\u0006\u0010\u001f\u001a\u00020\u0005J\u000e\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010!\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0003J\u0006\u0010\"\u001a\u00020\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u00182\u0006\u0010$\u001a\u00020#J\u000e\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#J\u000e\u0010(\u001a\u00020&2\u0006\u0010$\u001a\u00020#J\u0006\u0010)\u001a\u00020\u0005J\u0006\u0010*\u001a\u00020\u0005J\u000e\u0010,\u001a\u00020\u00052\u0006\u0010+\u001a\u00020#J\u0006\u0010-\u001a\u00020\u0005J\u0006\u0010.\u001a\u00020\u0005J\u0006\u0010/\u001a\u00020\u0005J\u0006\u00100\u001a\u00020\u0005J\u0006\u00101\u001a\u00020&J\u0006\u00102\u001a\u00020&J\u0006\u00103\u001a\u00020&J\u0006\u00104\u001a\u00020&J\u0006\u00105\u001a\u00020&J\u0006\u00106\u001a\u00020&J\u0006\u00107\u001a\u00020\u000bJ\u0006\u00108\u001a\u00020&J\u0006\u00109\u001a\u00020&J\u0006\u0010:\u001a\u00020&J\u0006\u0010;\u001a\u00020&J\u0006\u0010<\u001a\u00020&J\u0006\u0010=\u001a\u00020&J\u0006\u0010>\u001a\u00020&J\u0006\u0010?\u001a\u00020&J\u0006\u0010@\u001a\u00020&J\u0006\u0010A\u001a\u00020&J\u0006\u0010B\u001a\u00020&J\u0006\u0010C\u001a\u00020&J\u0006\u0010D\u001a\u00020&J\u0006\u0010E\u001a\u00020&J\u0006\u0010F\u001a\u00020&J\u0006\u0010G\u001a\u00020&J\u0006\u0010H\u001a\u00020\u000bJ\u0006\u0010I\u001a\u00020&J\u0006\u0010J\u001a\u00020&J\u000e\u0010L\u001a\u00020\u00052\u0006\u0010K\u001a\u00020\u000bJ\u000e\u0010M\u001a\u00020\u00052\u0006\u0010K\u001a\u00020\u000bJ\u0006\u0010O\u001a\u00020NJ\u0006\u0010P\u001a\u00020\u000bJ\u0006\u0010Q\u001a\u00020\u000bJ\f\u0010T\u001a\b\u0012\u0004\u0012\u00020S0RJ\b\u0010V\u001a\u0004\u0018\u00010UJ\u0006\u0010W\u001a\u00020&R*\u0010Y\u001a\u00020\u00032\u0006\u0010X\u001a\u00020\u00038\u0006@FX\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010`\u001a\u00020_8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR$\u0010g\u001a\u0004\u0018\u00010f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010m\u001a\u00020#8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR$\u0010s\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\u0017\u0010y\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R\"\u0010}\u001a\u00020#8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b}\u0010n\u001a\u0004\b~\u0010p\"\u0004\b\u0010rR&\u0010\u0001\u001a\u00020#8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010n\u001a\u0005\b\u0001\u0010p\"\u0005\b\u0001\u0010rR)\u0010\u0001\u001a\u00020&8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R'\u0010\u0001\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0016\n\u0005\b\u0001\u0010z\u001a\u0005\b\u0001\u0010|\"\u0006\b\u0001\u0010\u0001R)\u0010\u0001\u001a\u00020&8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R+\u0010\u0001\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R+\u0010\u0001\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R+\u0010\u0001\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R+\u0010\u0001\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R,\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R,\u0010¤\u0001\u001a\u0005\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b¤\u0001\u0010\u0001\u001a\u0006\b¥\u0001\u0010¡\u0001\"\u0006\b¦\u0001\u0010£\u0001R$\u0010©\u0001\u001a\n\u0012\u0005\u0012\u00030¨\u00010§\u00018\u0006¢\u0006\u0010\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R+\u0010­\u0001\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b­\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R\u001d\u0010³\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000R8\u0002X\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R!\u0010¶\u0001\u001a\n\u0012\u0005\u0012\u00030µ\u00010§\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010ª\u0001R,\u0010¸\u0001\u001a\u0005\u0018\u00010·\u00018F@\u0006X\u000e¢\u0006\u0018\n\u0006\b¸\u0001\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R+\u0010¾\u0001\u001a\u0004\u0018\u00010\u00078F@\u0006X\u000e¢\u0006\u0018\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R'\u0010Ä\u0001\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0016\n\u0005\bÄ\u0001\u0010z\u001a\u0005\bÅ\u0001\u0010|\"\u0006\bÆ\u0001\u0010\u0001R)\u0010Ç\u0001\u001a\u00020&8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\bÇ\u0001\u0010\u0001\u001a\u0006\bÈ\u0001\u0010\u0001\"\u0006\bÉ\u0001\u0010\u0001R\u0015\u0010Ë\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\bÊ\u0001\u0010vR'\u0010Î\u0001\u001a\u00020\u000b2\u0006\u0010X\u001a\u00020\u000b8F@FX\u000e¢\u0006\u000e\u001a\u0005\bÌ\u0001\u0010v\"\u0005\bÍ\u0001\u0010xR/\u0010Ô\u0001\u001a\u0005\u0018\u00010Ï\u00012\t\u0010X\u001a\u0005\u0018\u00010Ï\u00018F@FX\u000e¢\u0006\u0010\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\"\u0006\bÒ\u0001\u0010Ó\u0001R(\u0010×\u0001\u001a\u00020\t2\u0006\u0010X\u001a\u00020\t8F@FX\u000e¢\u0006\u000f\u001a\u0005\bÕ\u0001\u0010|\"\u0006\bÖ\u0001\u0010\u0001R'\u0010Ú\u0001\u001a\u00020\u000b2\u0006\u0010X\u001a\u00020\u000b8F@FX\u000e¢\u0006\u000e\u001a\u0005\bØ\u0001\u0010v\"\u0005\bÙ\u0001\u0010xR'\u0010Ý\u0001\u001a\u00020\u000b2\u0006\u0010X\u001a\u00020\u000b8F@FX\u000e¢\u0006\u000e\u001a\u0005\bÛ\u0001\u0010v\"\u0005\bÜ\u0001\u0010xR&\u0010ß\u0001\u001a\u00020#2\u0006\u0010X\u001a\u00020#8F@FX\u000e¢\u0006\r\u001a\u0004\b\u001a\u0010p\"\u0005\bÞ\u0001\u0010rR'\u0010â\u0001\u001a\u00020#2\u0006\u0010X\u001a\u00020#8F@FX\u000e¢\u0006\u000e\u001a\u0005\bà\u0001\u0010p\"\u0005\bá\u0001\u0010rR'\u0010å\u0001\u001a\u00020#2\u0006\u0010X\u001a\u00020#8F@FX\u000e¢\u0006\u000e\u001a\u0005\bã\u0001\u0010p\"\u0005\bä\u0001\u0010rR'\u0010è\u0001\u001a\u00020#2\u0006\u0010X\u001a\u00020#8F@FX\u000e¢\u0006\u000e\u001a\u0005\bæ\u0001\u0010p\"\u0005\bç\u0001\u0010rR'\u0010ë\u0001\u001a\u00020#2\u0006\u0010X\u001a\u00020#8F@FX\u000e¢\u0006\u000e\u001a\u0005\bé\u0001\u0010p\"\u0005\bê\u0001\u0010rR'\u0010î\u0001\u001a\u00020#2\u0006\u0010X\u001a\u00020#8F@FX\u000e¢\u0006\u000e\u001a\u0005\bì\u0001\u0010p\"\u0005\bí\u0001\u0010rR'\u0010ñ\u0001\u001a\u00020#2\u0006\u0010X\u001a\u00020#8F@FX\u000e¢\u0006\u000e\u001a\u0005\bï\u0001\u0010p\"\u0005\bð\u0001\u0010rR'\u0010ô\u0001\u001a\u00020#2\u0006\u0010X\u001a\u00020#8F@FX\u000e¢\u0006\u000e\u001a\u0005\bò\u0001\u0010p\"\u0005\bó\u0001\u0010rR'\u0010÷\u0001\u001a\u00020#2\u0006\u0010X\u001a\u00020#8F@FX\u000e¢\u0006\u000e\u001a\u0005\bõ\u0001\u0010p\"\u0005\bö\u0001\u0010rR'\u0010ú\u0001\u001a\u00020#2\u0006\u0010X\u001a\u00020#8F@FX\u000e¢\u0006\u000e\u001a\u0005\bø\u0001\u0010p\"\u0005\bù\u0001\u0010rR'\u0010ý\u0001\u001a\u00020#2\u0006\u0010X\u001a\u00020#8F@FX\u000e¢\u0006\u000e\u001a\u0005\bû\u0001\u0010p\"\u0005\bü\u0001\u0010rR'\u0010\u0002\u001a\u00020\u000b2\u0006\u0010X\u001a\u00020\u000b8F@FX\u000e¢\u0006\u000e\u001a\u0005\bþ\u0001\u0010v\"\u0005\bÿ\u0001\u0010xR\u0013\u0010\u0002\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b\u0002\u0010vR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00180R8F¢\u0006\b\u001a\u0006\b\u0002\u0010\u0002R5\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00180R2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00180R8F@FX\u000e¢\u0006\u0010\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R5\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00180R2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00180R8F@FX\u000e¢\u0006\u0010\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R5\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00180R2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00180R8F@FX\u000e¢\u0006\u0010\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R5\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000R2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00000R8F@FX\u000e¢\u0006\u0010\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R\u0014\u0010\u0002\u001a\u00020&8F¢\u0006\b\u001a\u0006\b\u0002\u0010\u0001R\u0014\u0010\u0002\u001a\u00020&8F¢\u0006\b\u001a\u0006\b\u0002\u0010\u0001R7\u0010\u0002\u001a\t\u0012\u0005\u0012\u00030\u00020R2\r\u0010X\u001a\t\u0012\u0005\u0012\u00030\u00020R8F@FX\u000e¢\u0006\u0010\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R7\u0010\u0002\u001a\t\u0012\u0005\u0012\u00030\u00020R2\r\u0010X\u001a\t\u0012\u0005\u0012\u00030\u00020R8F@FX\u000e¢\u0006\u0010\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R+\u0010¡\u0002\u001a\u00030\u00022\u0007\u0010X\u001a\u00030\u00028F@FX\u000e¢\u0006\u0010\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010 \u0002R+\u0010§\u0002\u001a\u00030¢\u00022\u0007\u0010X\u001a\u00030¢\u00028F@FX\u000e¢\u0006\u0010\u001a\u0006\b£\u0002\u0010¤\u0002\"\u0006\b¥\u0002\u0010¦\u0002R+\u0010­\u0002\u001a\u00030¨\u00022\u0007\u0010X\u001a\u00030¨\u00028F@FX\u000e¢\u0006\u0010\u001a\u0006\b©\u0002\u0010ª\u0002\"\u0006\b«\u0002\u0010¬\u0002R(\u0010°\u0002\u001a\u00020\t2\u0006\u0010X\u001a\u00020\t8F@FX\u000e¢\u0006\u000f\u001a\u0005\b®\u0002\u0010|\"\u0006\b¯\u0002\u0010\u0001R(\u0010³\u0002\u001a\u00020\t2\u0006\u0010X\u001a\u00020\t8F@FX\u000e¢\u0006\u000f\u001a\u0005\b±\u0002\u0010|\"\u0006\b²\u0002\u0010\u0001R'\u0010¶\u0002\u001a\u00020#2\u0006\u0010X\u001a\u00020#8F@FX\u000e¢\u0006\u000e\u001a\u0005\b´\u0002\u0010p\"\u0005\bµ\u0002\u0010rR'\u0010¹\u0002\u001a\u00020#2\u0006\u0010X\u001a\u00020#8F@FX\u000e¢\u0006\u000e\u001a\u0005\b·\u0002\u0010p\"\u0005\b¸\u0002\u0010rR'\u0010¼\u0002\u001a\u00020#2\u0006\u0010X\u001a\u00020#8F@FX\u000e¢\u0006\u000e\u001a\u0005\bº\u0002\u0010p\"\u0005\b»\u0002\u0010rR\u001c\u0010¿\u0002\u001a\n\u0012\u0005\u0012\u00030µ\u00010½\u00028F¢\u0006\b\u001a\u0006\b¾\u0002\u0010¬\u0001R/\u0010Å\u0002\u001a\u0005\u0018\u00010À\u00022\t\u0010X\u001a\u0005\u0018\u00010À\u00028F@FX\u000e¢\u0006\u0010\u001a\u0006\bÁ\u0002\u0010Â\u0002\"\u0006\bÃ\u0002\u0010Ä\u0002¨\u0006Ê\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/storage/FinderItem;", "Lxh/f3;", "Ljava/io/Serializable;", "Lcom/tencent/mm/protocal/protobuf/FinderObject;", "obj", "Lrx3/b0;", "fixMediaType", "Lte3/cg;", "getBizInfoByObject", "", "getId", "", "getUnsignedId", "getExpectId", "Lcom/tencent/mm/sdk/storage/IAutoDBItem$MAutoDBInfo;", "getDBInfo", "Landroid/text/SpannableString;", "createDescriptionFullSpan", "createDescriptionFullSpan2", "createDescSpanWithoutClick", "Landroid/database/Cursor;", "cu", "convertFrom", "mediaId", "Lte3/rq2;", "mediaExt", "getCreateTime", "Lte3/tq2;", "getPostInfo", "field_postinfo", "setPostInfo", "updateNicknameAndDesc", "svrFeed", "updateFinderObject", "getFinderObject", "", "index", "getCropInfo", "", "isNeedCrop", "isNeedVideoCompositionPlay", "setPostWaiting", "setPostFailed", "errCode", "setPostFailedAndNotRetry", "setEventClosed", "setEventExpired", "setPostFailedAndNoAuth", "setPostFinish", "isEventClosed", "isEventExpired", "isPostFinish", "isPostFailed", "isPostFailedCanRetry", "isPostNoAuth", "info", "isOldVersion", "isCommentClose", "isChosenComment", "isPostFromMP", "isShowSetRingtoneBtn", "isEnableShowSetRingtoneBtn", "isDisableShowSetRingtoneBtn", "isProfileShowFromSns", "isSupportCache", "isPrivate", "isOnlySelfSee", "isNotShare", "isNotShareSns", "isNotShareConversation", "isLiveFeed", "isReplayLiveFeed", "getNotShareMsg", "isLive", "isMvFeed", "stage", "trackPost", "trackDraftPost", "Lte3/p81;", "getFinderLive", "getFromAppId", "getFromAppExtInfo", "Ljava/util/LinkedList;", "Lte3/sf0;", "getJumpAttachments", "Lcom/tencent/mm/protocal/protobuf/FinderJumpInfo;", "getFirstJumpInfo", "isUrlValid", "value", "feedObject", "Lcom/tencent/mm/protocal/protobuf/FinderObject;", "getFeedObject", "()Lcom/tencent/mm/protocal/protobuf/FinderObject;", "setFeedObject", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;)V", "Ler1/n;", "topicClickExtra", "Ler1/n;", "getTopicClickExtra", "()Ler1/n;", "setTopicClickExtra", "(Ler1/n;)V", "Ler1/k0;", "posTriggerConfig", "Ler1/k0;", "getPosTriggerConfig", "()Ler1/k0;", "setPosTriggerConfig", "(Ler1/k0;)V", "commentScene", "I", "getCommentScene", "()I", "setCommentScene", "(I)V", "ecSource", "Ljava/lang/String;", "getEcSource", "()Ljava/lang/String;", "setEcSource", "(Ljava/lang/String;)V", "timestamps", "J", "getTimestamps", "()J", "fromType", "getFromType", "setFromType", "mediaType", "getMediaType", "setMediaType", "isRelatedItem", "Z", "()Z", "setRelatedItem", "(Z)V", "relatedFeedId", "getRelatedFeedId", "setRelatedFeedId", "(J)V", "isPreview", "setPreview", "nickNameSpan", "Landroid/text/SpannableString;", "getNickNameSpan", "()Landroid/text/SpannableString;", "setNickNameSpan", "(Landroid/text/SpannableString;)V", "flowCardDescSpan", "getFlowCardDescSpan", "setFlowCardDescSpan", "descriptionSpan", "getDescriptionSpan", "setDescriptionSpan", "descriptionFullSpan", "getDescriptionFullSpan", "setDescriptionFullSpan", "Lyr3/a;", "descLayout", "Lyr3/a;", "getDescLayout", "()Lyr3/a;", "setDescLayout", "(Lyr3/a;)V", "cardDescLayout", "getCardDescLayout", "setCardDescLayout", "", "Ler1/q5;", "topicList", "Ljava/util/List;", "getTopicList", "()Ljava/util/List;", "liveFinderMedia", "Lte3/rq2;", "getLiveFinderMedia", "()Lte3/rq2;", "setLiveFinderMedia", "(Lte3/rq2;)V", "_clipListExt", "Ljava/util/LinkedList;", "Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;", "foldedFeeds", "Lte3/bl0;", "foldedLayout", "Lte3/bl0;", "getFoldedLayout", "()Lte3/bl0;", "setFoldedLayout", "(Lte3/bl0;)V", "bizInfo", "Lte3/cg;", "getBizInfo", "()Lte3/cg;", "setBizInfo", "(Lte3/cg;)V", "msgId", "getMsgId", "setMsgId", "showExtendLink", "getShowExtendLink", "setShowExtendLink", "getAvatarUrl", "avatarUrl", "getObjectNonceId", "setObjectNonceId", "objectNonceId", "Lte3/c21;", "getLiveInfo", "()Lte3/c21;", "setLiveInfo", "(Lte3/c21;)V", "liveInfo", "getLocalId", "setLocalId", "localId", "getNickName", "setNickName", "nickName", "getUserName", "setUserName", "userName", "setCreateTime", "createTime", "getLikeFlag", "setLikeFlag", "likeFlag", "getFavFlag", "setFavFlag", "favFlag", "getForwardCount", "setForwardCount", "forwardCount", "getReadCount", "setReadCount", "readCount", "getFollowCount", "setFollowCount", "followCount", "getLikeCount", "setLikeCount", "likeCount", "getFavCount", "setFavCount", "favCount", "getMentionListSelected", "setMentionListSelected", "mentionListSelected", "getFriendLikeCount", "setFriendLikeCount", "friendLikeCount", "getCommentCount", "setCommentCount", "commentCount", "getDescription", "setDescription", "description", "getDebugDescription", "debugDescription", "getLiveMediaList", "()Ljava/util/LinkedList;", "liveMediaList", "getMediaList", "setMediaList", "(Ljava/util/LinkedList;)V", "mediaList", "getMediaExtList", "setMediaExtList", "mediaExtList", "getHalfVideoMediaExtList", "setHalfVideoMediaExtList", "halfVideoMediaExtList", "getClipListExt", "setClipListExt", "clipListExt", "isLongVideo", "isProductAttached", "Lcom/tencent/mm/protocal/protobuf/FinderCommentInfo;", "getLikeList", "setLikeList", "likeList", "getCommentList", "setCommentList", "commentList", "Lte3/db1;", "getLocation", "()Lte3/db1;", "setLocation", "(Lte3/db1;)V", "location", "Lte3/jk0;", "getExtReading", "()Lte3/jk0;", "setExtReading", "(Lte3/jk0;)V", "extReading", "Lcom/tencent/mm/protocal/protobuf/FinderContact;", "getRefObjectContact", "()Lcom/tencent/mm/protocal/protobuf/FinderContact;", "setRefObjectContact", "(Lcom/tencent/mm/protocal/protobuf/FinderContact;)V", "refObjectContact", "getRefObjectFlag", "setRefObjectFlag", "refObjectFlag", "getRefObjectId", "setRefObjectId", "refObjectId", "getComment_close", "setComment_close", "comment_close", "getPrivate_flag", "setPrivate_flag", "private_flag", "getStickyTime", "setStickyTime", "stickyTime", "", "getFoldedFeedList", "foldedFeedList", "Lte3/lj0;", "getCustomData", "()Lte3/lj0;", "setCustomData", "(Lte3/lj0;)V", "customData", "<init>", "()V", "Companion", "a", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.storage.FinderItem */
public class FinderItem extends C66261f3 implements Serializable {
    public static final C56324a Companion = new C56324a((C8480h) null);
    /* access modifiers changed from: private */
    public static final String TAG = "Finder.FinderItem";
    /* access modifiers changed from: private */
    public static final int _2A;
    /* access modifiers changed from: private */
    public static boolean debugOnlySelfSee;
    /* access modifiers changed from: private */
    public static final IAutoDBItem.MAutoDBInfo info;
    /* access modifiers changed from: private */
    public static final int layoutWidth;
    /* access modifiers changed from: private */
    public static MMNeat7extView preMeasuredTextView;
    private final LinkedList<FinderItem> _clipListExt = new LinkedList<>();
    private C64284cg bizInfo;
    private C79150a cardDescLayout;
    private int commentScene;
    private C79150a descLayout;
    private SpannableString descriptionFullSpan;
    private SpannableString descriptionSpan;
    private String ecSource;
    private FinderObject feedObject;
    private SpannableString flowCardDescSpan;
    private List<BaseFinderFeed> foldedFeeds = new ArrayList();
    private C48872bl0 foldedLayout;
    private int fromType;
    private boolean isPreview;
    private boolean isRelatedItem;
    private C64689rq2 liveFinderMedia;
    private int mediaType;
    private long msgId;
    private SpannableString nickNameSpan;
    private C7823k0 posTriggerConfig;
    private long relatedFeedId;
    private boolean showExtendLink;
    private final long timestamps = C31543z5.m39453c();
    private C7840n topicClickExtra = new C7840n(0, 0, (WeakReference) null, (Boolean) null, 14, (C8480h) null);
    private final List<C58773q5> topicList = new ArrayList();

    /* renamed from: com.tencent.mm.plugin.finder.storage.FinderItem$b */
    public static final class C3623b extends C87413o implements C32227p<String, C7840n, C13598b0> {

        /* renamed from: d */
        public static final C3623b f16715d = new C3623b();

        public C3623b() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C87412m.m108594g((String) obj, "topic");
            C87412m.m108594g((C7840n) obj2, "clickExtra");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.storage.FinderItem$c */
    public static final class C3624c extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public static final C3624c f16716d = new C3624c();

        public C3624c() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((String) obj, "username");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.storage.FinderItem$d */
    public static final class C3625d extends C87413o implements C32227p<String, C7840n, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderItem f16717d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3625d(FinderItem finderItem) {
            super(2);
            this.f16717d = finderItem;
        }

        public Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            C7840n nVar = (C7840n) obj2;
            C87412m.m108594g(str, "topic");
            C87412m.m108594g(nVar, "clickExtra");
            nVar.f26404c = this.f16717d.getTopicClickExtra().f26404c;
            nVar.f26405d = Boolean.TRUE;
            ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76674OT(str, Long.valueOf(this.f16717d.field_id), nVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.storage.FinderItem$e */
    public static final class C3626e extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderItem f16718d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3626e(FinderItem finderItem) {
            super(1);
            this.f16718d = finderItem;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "username");
            C64916p1 p1Var = (C64916p1) C86312j.m106911c(C64916p1.class);
            WeakReference<Context> weakReference = this.f16718d.getTopicClickExtra().f26404c;
            p1Var.mo76664Hs(weakReference != null ? weakReference.get() : null, str, this.f16718d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.storage.FinderItem$a */
    public static final class C56324a {
        public C56324a(C8480h hVar) {
        }

        /* renamed from: b */
        public static /* synthetic */ FinderItem m64570b(C56324a aVar, FinderObject finderObject, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return aVar.mo79056a(finderObject, i);
        }

        /* renamed from: a */
        public final FinderItem mo79056a(FinderObject finderObject, int i) {
            String str;
            C87412m.m108594g(finderObject, "feedObject");
            FinderItem finderItem = new FinderItem();
            finderItem.setFromType(i);
            finderItem.setFeedObject(finderObject);
            if (Util.isNullOrNil(finderItem.getFeedObject().nickname) && finderItem.getFeedObject().contact != null) {
                FinderContact finderContact = finderItem.getFeedObject().contact;
                if (!Util.isNullOrNil(finderContact != null ? finderContact.nickname : null)) {
                    FinderObject feedObject = finderItem.getFeedObject();
                    FinderContact finderContact2 = finderItem.getFeedObject().contact;
                    if (finderContact2 == null || (str = finderContact2.nickname) == null) {
                        str = "";
                    }
                    feedObject.nickname = str;
                }
            }
            return finderItem;
        }

        /* renamed from: c */
        public final FinderItem mo79057c(FinderObject finderObject, C64394ge0 ge02, long j) {
            C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
            FinderItem finderItem = new FinderItem();
            finderItem.setLocalId(j);
            finderItem.setFeedObject(finderObject);
            if (ge02 != null) {
                finderItem.field_localFlag = ge02.f183308d;
                finderItem.field_postinfo = ge02.f183309e;
                finderItem.field_mediaExtList = ge02.f183310f;
                finderItem.field_reportObject = ge02.f183311g;
                finderItem.field_postExtraData = ge02.f183312h;
                finderItem.field_customData = ge02.f183313i;
                finderItem.field_longVideoMediaExtList = ge02.f183314j;
                finderItem.field_halfMediaExtList = ge02.f183315n;
                finderItem.field_clipList = ge02.f183316o;
            }
            return finderItem;
        }

        /* renamed from: d */
        public final FinderItem mo79058d(C64783vq0 vq02, long j) {
            C87412m.m108594g(vq02, "<this>");
            FinderObject finderObject = vq02.f185976d;
            if (finderObject == null) {
                return new FinderItem();
            }
            if (finderObject == null) {
                finderObject = new FinderObject();
            }
            return mo79057c(finderObject, vq02.f185977e, j);
        }

        /* renamed from: e */
        public final C64783vq0 mo79059e(FinderItem finderItem) {
            C87412m.m108594g(finderItem, "<this>");
            C64783vq0 vq02 = new C64783vq0();
            vq02.f185976d = finderItem.getFeedObject();
            C64394ge0 ge02 = new C64394ge0();
            ge02.f183308d = finderItem.field_localFlag;
            ge02.f183309e = finderItem.field_postinfo;
            ge02.f183310f = finderItem.field_mediaExtList;
            ge02.f183311g = finderItem.field_reportObject;
            ge02.f183312h = finderItem.field_postExtraData;
            ge02.f183313i = finderItem.field_customData;
            ge02.f183314j = finderItem.field_longVideoMediaExtList;
            ge02.f183315n = finderItem.field_halfMediaExtList;
            ge02.f183316o = finderItem.field_clipList;
            vq02.f185977e = ge02;
            return vq02;
        }
    }

    static {
        IAutoDBItem.MAutoDBInfo initAutoDBInfo = C66261f3.initAutoDBInfo(FinderItem.class);
        C87412m.m108593f(initAutoDBInfo, "initAutoDBInfo(FinderItem::class.java)");
        info = initAutoDBInfo;
        int dimension = (int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3736cp);
        _2A = dimension;
        layoutWidth = MMApplicationContext.getContext().getResources().getDisplayMetrics().widthPixels - ((int) (((float) dimension) * 2.5f));
    }

    public FinderItem() {
        FinderObject finderObject = new FinderObject();
        FinderObjectDesc finderObjectDesc = new FinderObjectDesc();
        finderObject.objectDesc = finderObjectDesc;
        finderObjectDesc.location = new C64311db1();
        this.feedObject = finderObject;
    }

    private final void fixMediaType(FinderObject finderObject) {
        LinkedList<FinderMedia> linkedList;
        int h = C58739j4.f168176a.mo83711h(finderObject);
        FinderObjectDesc finderObjectDesc = finderObject.objectDesc;
        if (finderObjectDesc != null && (linkedList = finderObjectDesc.media) != null) {
            for (FinderMedia finderMedia : linkedList) {
                if (finderMedia.mediaType == 0) {
                    finderMedia.mediaType = h;
                }
            }
        }
    }

    private final C64284cg getBizInfoByObject(FinderObject finderObject) {
        FinderContact finderContact = finderObject.contact;
        if (finderContact != null) {
            return C58960c.m68829a(finderContact, false);
        }
        return null;
    }

    private static final int getFinderLive$getChargeFlag(String str, C64273c21 c212) {
        C64337e61 e612;
        Class cls = C60606n.class;
        if (((C61397g) C86312j.m106911c(C61397g.class)).ah0(str, c212)) {
            return ((C60606n) C86312j.m106911c(cls)).Sj0(c212) ? 6 : 4;
        }
        if (((C60606n) C86312j.m106911c(cls)).mo85008I1(c212)) {
            return 2;
        }
        if (c212 == null || (e612 = c212.f182363I) == null) {
            return 0;
        }
        return e612.f182920d;
    }

    public void convertFrom(Cursor cursor) {
        C87412m.m108594g(cursor, "cu");
        super.convertFrom(cursor);
        FinderObject finderObject = this.field_finderObject;
        if (finderObject == null) {
            finderObject = new FinderObject();
        }
        setFeedObject(finderObject);
        this.feedObject.username = C66785b.f191882e.mo90662O5();
        this.mediaType = C58739j4.f168176a.mo83711h(this.feedObject);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r1 = r1.topic;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.SpannableString createDescSpanWithoutClick() {
        /*
            r12 = this;
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r12.feedObject
            java.lang.Class<tf0.p1> r1 = tf0.C64916p1.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            r2 = r1
            tf0.p1 r2 = (tf0.C64916p1) r2
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r0.objectDesc
            r3 = 0
            if (r1 == 0) goto L_0x0017
            te3.pn1 r1 = r1.topic
            if (r1 == 0) goto L_0x0017
            java.lang.String r1 = r1.f184865d
            goto L_0x0018
        L_0x0017:
            r1 = r3
        L_0x0018:
            android.text.SpannableString r4 = r12.descriptionSpan
            if (r4 != 0) goto L_0x0023
            android.text.SpannableString r4 = new android.text.SpannableString
            java.lang.String r5 = ""
            r4.<init>(r5)
        L_0x0023:
            long r5 = r12.field_id
            java.util.List<er1.q5> r7 = r12.topicList
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderContact> r8 = r0.mentionedUserContact
            if (r8 != 0) goto L_0x0030
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
        L_0x0030:
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x0036
            java.util.LinkedList<te3.jc1> r3 = r0.mentionedUser
        L_0x0036:
            if (r3 != 0) goto L_0x003f
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r9 = r0
            goto L_0x0040
        L_0x003f:
            r9 = r3
        L_0x0040:
            com.tencent.mm.plugin.finder.storage.FinderItem$b r10 = com.tencent.p014mm.plugin.finder.storage.FinderItem.C3623b.f16715d
            com.tencent.mm.plugin.finder.storage.FinderItem$c r11 = com.tencent.p014mm.plugin.finder.storage.FinderItem.C3624c.f16716d
            r3 = r1
            android.text.SpannableString r0 = r2.e90(r3, r4, r5, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.storage.FinderItem.createDescSpanWithoutClick():android.text.SpannableString");
    }

    public final SpannableString createDescriptionFullSpan() {
        SpannableString createDescriptionFullSpan2 = createDescriptionFullSpan2();
        this.descriptionFullSpan = createDescriptionFullSpan2;
        return createDescriptionFullSpan2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r1 = r1.topic;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.SpannableString createDescriptionFullSpan2() {
        /*
            r12 = this;
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r12.feedObject
            java.lang.Class<tf0.p1> r1 = tf0.C64916p1.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            r2 = r1
            tf0.p1 r2 = (tf0.C64916p1) r2
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r0.objectDesc
            r3 = 0
            if (r1 == 0) goto L_0x0017
            te3.pn1 r1 = r1.topic
            if (r1 == 0) goto L_0x0017
            java.lang.String r1 = r1.f184865d
            goto L_0x0018
        L_0x0017:
            r1 = r3
        L_0x0018:
            android.text.SpannableString r4 = r12.descriptionSpan
            if (r4 != 0) goto L_0x0023
            android.text.SpannableString r4 = new android.text.SpannableString
            java.lang.String r5 = ""
            r4.<init>(r5)
        L_0x0023:
            long r5 = r12.field_id
            java.util.List<er1.q5> r7 = r12.topicList
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderContact> r8 = r0.mentionedUserContact
            if (r8 != 0) goto L_0x0030
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
        L_0x0030:
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x0036
            java.util.LinkedList<te3.jc1> r3 = r0.mentionedUser
        L_0x0036:
            if (r3 != 0) goto L_0x003f
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r9 = r0
            goto L_0x0040
        L_0x003f:
            r9 = r3
        L_0x0040:
            com.tencent.mm.plugin.finder.storage.FinderItem$d r10 = new com.tencent.mm.plugin.finder.storage.FinderItem$d
            r10.<init>(r12)
            com.tencent.mm.plugin.finder.storage.FinderItem$e r11 = new com.tencent.mm.plugin.finder.storage.FinderItem$e
            r11.<init>(r12)
            r3 = r1
            android.text.SpannableString r0 = r2.e90(r3, r4, r5, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.storage.FinderItem.createDescriptionFullSpan2():android.text.SpannableString");
    }

    public final String getAvatarUrl() {
        C52192z0 e6;
        String str;
        FinderContact finderContact = this.feedObject.contact;
        String str2 = finderContact != null ? finderContact.headUrl : null;
        C60216z4 l7 = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7();
        return (!l7.mo83767N5(this.feedObject) || (e6 = l7.mo83786e6(this.feedObject)) == null || (str = e6.f145601e) == null) ? str2 : str;
    }

    public final C64284cg getBizInfo() {
        FinderContact finderContact = this.feedObject.contact;
        if (finderContact != null) {
            return C58960c.m68829a(finderContact, false);
        }
        return null;
    }

    public final C79150a getCardDescLayout() {
        return this.cardDescLayout;
    }

    public final LinkedList<FinderItem> getClipListExt() {
        C64532lq2 lq22;
        LinkedList<C64783vq0> linkedList;
        if (!(!this._clipListExt.isEmpty() || (lq22 = this.field_clipList) == null || (linkedList = lq22.f184151d) == null)) {
            for (C64783vq0 vq02 : linkedList) {
                LinkedList<FinderItem> linkedList2 = this._clipListExt;
                C56324a aVar = Companion;
                C87412m.m108593f(vq02, LocaleUtil.ITALIAN);
                linkedList2.add(aVar.mo79058d(vq02, 0));
            }
        }
        return this._clipListExt;
    }

    public final int getCommentCount() {
        return this.feedObject.commentCount;
    }

    public final LinkedList<FinderCommentInfo> getCommentList() {
        LinkedList<FinderCommentInfo> linkedList = this.feedObject.commentList;
        C87412m.m108593f(linkedList, "feedObject.commentList");
        return linkedList;
    }

    public final int getCommentScene() {
        return this.commentScene;
    }

    public final int getComment_close() {
        return this.feedObject.commentClose;
    }

    public final int getCreateTime() {
        return this.feedObject.createtime;
    }

    public final C64689rq2 getCropInfo(int i) {
        LinkedList<C64689rq2> mediaList = getMediaList();
        if (mediaList != null) {
            return (C64689rq2) C110818d0.m150917O(mediaList, i);
        }
        return null;
    }

    public final C50271lj0 getCustomData() {
        return this.field_customData;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return info;
    }

    public final String getDebugDescription() {
        String description = getDescription();
        String substring = description.substring(0, Math.min(description.length(), 3));
        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final C79150a getDescLayout() {
        return this.descLayout;
    }

    public final String getDescription() {
        FinderObjectDesc finderObjectDesc = this.feedObject.objectDesc;
        String str = finderObjectDesc != null ? finderObjectDesc.description : null;
        return str == null ? "" : str;
    }

    public final SpannableString getDescriptionFullSpan() {
        return this.descriptionFullSpan;
    }

    public final SpannableString getDescriptionSpan() {
        return this.descriptionSpan;
    }

    public final String getEcSource() {
        return this.ecSource;
    }

    public final long getExpectId() {
        long j = this.field_id;
        return j == 0 ? getLocalId() : j;
    }

    public final C64472jk0 getExtReading() {
        FinderObjectDesc finderObjectDesc = this.feedObject.objectDesc;
        C64472jk0 jk02 = finderObjectDesc != null ? finderObjectDesc.extReading : null;
        if (jk02 != null) {
            return jk02;
        }
        C64472jk0 jk03 = new C64472jk0();
        jk03.f183802d = "";
        jk03.f183803e = "";
        return jk03;
    }

    public final int getFavCount() {
        return this.feedObject.favCount;
    }

    public final int getFavFlag() {
        return this.feedObject.favFlag;
    }

    public final FinderObject getFeedObject() {
        return this.feedObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a6, code lost:
        if (r5 == null) goto L_0x00a8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final te3.C64623p81 getFinderLive() {
        /*
            r7 = this;
            te3.p81 r0 = new te3.p81
            r0.<init>()
            long r1 = r7.getId()
            java.lang.String r1 = o40.C61926c.m72691p(r1)
            r0.f184780f = r1
            te3.c21 r1 = r7.getLiveInfo()
            if (r1 == 0) goto L_0x0018
            long r1 = r1.f182392d
            goto L_0x001a
        L_0x0018:
            r1 = 0
        L_0x001a:
            java.lang.String r1 = o40.C61926c.m72691p(r1)
            r0.f184778d = r1
            java.lang.String r1 = r7.field_username
            r0.f184779e = r1
            java.lang.String r1 = r7.getNickName()
            r0.f184781g = r1
            java.lang.Class<tf0.p1> r1 = tf0.C64916p1.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            tf0.p1 r1 = (tf0.C64916p1) r1
            java.lang.String r2 = r7.getDescription()
            java.lang.String r1 = r1.du0(r2)
            r0.f184782h = r1
            java.util.LinkedList r1 = r7.getLiveMediaList()
            java.lang.Object r1 = sx3.C110818d0.m150916N(r1)
            te3.rq2 r1 = (te3.C64689rq2) r1
            java.lang.String r2 = ""
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x00a8
            er1.j4 r5 = er1.C58739j4.f168176a
            r6 = 2
            java.lang.String r5 = r5.mo83674B(r1, r6)
            int r6 = r5.length()
            if (r6 <= 0) goto L_0x005b
            r6 = 1
            goto L_0x005c
        L_0x005b:
            r6 = 0
        L_0x005c:
            if (r6 == 0) goto L_0x005f
            goto L_0x00a6
        L_0x005f:
            java.lang.String r5 = r1.f185283w
            if (r5 == 0) goto L_0x006c
            int r5 = r5.length()
            if (r5 != 0) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            r5 = 0
            goto L_0x006d
        L_0x006c:
            r5 = 1
        L_0x006d:
            if (r5 == 0) goto L_0x008b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r1.f185267e
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            r5.append(r6)
            java.lang.String r6 = r1.f185288z
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            goto L_0x00a6
        L_0x008b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r1.f185283w
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            r5.append(r6)
            java.lang.String r6 = r1.f185234A
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
        L_0x00a6:
            if (r5 != 0) goto L_0x00a9
        L_0x00a8:
            r5 = r2
        L_0x00a9:
            r0.f184783i = r5
            r5 = 0
            if (r1 == 0) goto L_0x00b1
            float r6 = r1.f185270h
            goto L_0x00b2
        L_0x00b1:
            r6 = 0
        L_0x00b2:
            r0.f184784j = r6
            if (r1 == 0) goto L_0x00b8
            float r5 = r1.f185271i
        L_0x00b8:
            r0.f184785n = r5
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r7.feedObject
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r1.contact
            if (r5 == 0) goto L_0x00c4
            java.lang.String r5 = r5.headUrl
            if (r5 != 0) goto L_0x00c5
        L_0x00c4:
            r5 = r2
        L_0x00c5:
            r0.f184789r = r5
            java.lang.String r1 = r1.objectNonceId
            r0.f184790s = r1
            te3.c21 r1 = r7.getLiveInfo()
            if (r1 == 0) goto L_0x00d4
            int r1 = r1.f182394f
            goto L_0x00d5
        L_0x00d4:
            r1 = 1
        L_0x00d5:
            r0.f184791t = r1
            te3.c21 r1 = r7.getLiveInfo()
            if (r1 == 0) goto L_0x00e0
            int r1 = r1.f182405s
            goto L_0x00e1
        L_0x00e0:
            r1 = -1
        L_0x00e1:
            r0.f184793v = r1
            java.lang.String r1 = r7.ecSource
            if (r1 != 0) goto L_0x00e8
            r1 = r2
        L_0x00e8:
            r0.f184794w = r1
            java.lang.String r1 = r0.f184779e
            te3.c21 r5 = r7.getLiveInfo()
            int r1 = getFinderLive$getChargeFlag(r1, r5)
            r0.f184759C = r1
            te3.c21 r1 = r7.getLiveInfo()
            if (r1 == 0) goto L_0x00ff
            int r1 = r1.f182366L
            goto L_0x0100
        L_0x00ff:
            r1 = 0
        L_0x0100:
            r0.f184776U = r1
            java.lang.Class<ht1.v1> r1 = ht1.C60208v1.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ht1.v1 r1 = (ht1.C60208v1) r1
            java.lang.String r5 = r0.f184779e
            ht1.m5 r1 = r1.x40(r5)
            if (r1 == 0) goto L_0x012b
            boolean r5 = r1 instanceof fe1.C58969q
            if (r5 == 0) goto L_0x012b
            fe1.q r1 = (fe1.C58969q) r1
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r1 = r1.field_authInfo
            if (r1 == 0) goto L_0x011f
            int r5 = r1.authIconType
            goto L_0x0120
        L_0x011f:
            r5 = 0
        L_0x0120:
            r0.f184796y = r5
            if (r1 == 0) goto L_0x0128
            java.lang.String r1 = r1.authIconUrl
            if (r1 != 0) goto L_0x0129
        L_0x0128:
            r1 = r2
        L_0x0129:
            r0.f184795x = r1
        L_0x012b:
            fj1.b$a r1 = fj1.C45795b.f123697j
            fj1.b r1 = fj1.C45795b.f123698n
            if (r1 == 0) goto L_0x0148
            java.lang.Class<cl1.b> r5 = cl1.C0654b.class
            androidx.lifecycle.i0 r1 = r1.mo71262a(r5)
            cl1.b r1 = (cl1.C0654b) r1
            boolean r5 = r1.f1544f
            if (r5 == 0) goto L_0x0148
            r5 = 4
            r0.f184797z = r5
            java.lang.String r5 = r1.f1545g
            r0.f184757A = r5
            java.lang.String r1 = r1.f1546h
            r0.f184758B = r1
        L_0x0148:
            fj1.b r1 = fj1.C45795b.f123698n
            if (r1 == 0) goto L_0x01a4
            java.lang.Class<cl1.o> r5 = cl1.C54991o.class
            androidx.lifecycle.i0 r1 = r1.mo71262a(r5)
            cl1.o r1 = (cl1.C54991o) r1
            int r5 = r1.f154210I
            int r6 = ks3.C10411s.f31639a
            if (r5 != r3) goto L_0x0180
            java.lang.String r6 = r0.f184781g
            r0.f184762F = r6
            java.lang.String r6 = r0.f184779e
            r0.f184763G = r6
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r0.f184768L = r5
            int r5 = r1.f154218K
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r0.f184769M = r5
            int r5 = r1.f154214J
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r0.f184770N = r5
            int r5 = r1.f154222L
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r0.f184771P = r5
        L_0x0180:
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.f154341n
            if (r1 == 0) goto L_0x018f
            te3.c21 r5 = r1.liveInfo
            if (r5 == 0) goto L_0x018f
            te3.ix0 r5 = r5.f182386Y
            if (r5 == 0) goto L_0x018f
            int r5 = r5.f183745d
            goto L_0x0190
        L_0x018f:
            r5 = 0
        L_0x0190:
            r0.f184772Q = r5
            if (r1 == 0) goto L_0x01a2
            te3.c21 r1 = r1.liveInfo
            if (r1 == 0) goto L_0x01a2
            te3.ix0 r1 = r1.f182386Y
            if (r1 == 0) goto L_0x01a2
            java.lang.String r1 = r1.f183746e
            if (r1 != 0) goto L_0x01a1
            goto L_0x01a2
        L_0x01a1:
            r2 = r1
        L_0x01a2:
            r0.f184773R = r2
        L_0x01a4:
            fj1.b r1 = fj1.C45795b.f123698n
            if (r1 == 0) goto L_0x01c6
            java.lang.Class<cl1.u> r2 = cl1.C55001u.class
            androidx.lifecycle.i0 r1 = r1.mo71262a(r2)
            cl1.u r1 = (cl1.C55001u) r1
            te3.c21 r1 = r1.f154420q
            te3.r81 r1 = r1.f182387Y0
            if (r1 == 0) goto L_0x01bb
            int r2 = r1.f185144d
            if (r2 != r3) goto L_0x01bb
            goto L_0x01bc
        L_0x01bb:
            r3 = 0
        L_0x01bc:
            if (r3 == 0) goto L_0x01c6
            if (r1 == 0) goto L_0x01c3
            java.lang.String r1 = r1.f185145e
            goto L_0x01c4
        L_0x01c3:
            r1 = 0
        L_0x01c4:
            r0.f184777V = r1
        L_0x01c6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.storage.FinderItem.getFinderLive():te3.p81");
    }

    public final FinderObject getFinderObject() {
        return this.feedObject;
    }

    public final FinderJumpInfo getFirstJumpInfo() {
        C49040cr0 cr02;
        C51235sf0 sf02 = (C51235sf0) C110818d0.m150916N(getJumpAttachments());
        if (sf02 == null || (cr02 = sf02.f141471g) == null) {
            return null;
        }
        return cr02.f131919d;
    }

    public final SpannableString getFlowCardDescSpan() {
        return this.flowCardDescSpan;
    }

    public final List<BaseFinderFeed> getFoldedFeedList() {
        ArrayList<FinderObject> arrayList;
        LinkedList<FinderObject> linkedList;
        if (Util.isNullOrNil((List) this.foldedFeeds)) {
            C48872bl0 foldedLayout2 = getFoldedLayout();
            Collection collection = null;
            if (!Util.isNullOrNil((List) foldedLayout2 != null ? foldedLayout2.f131182e : null)) {
                C48872bl0 foldedLayout3 = getFoldedLayout();
                if (foldedLayout3 == null || (linkedList = foldedLayout3.f131182e) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>();
                    for (T next : linkedList) {
                        FinderObject finderObject = (FinderObject) next;
                        if ((finderObject != null ? finderObject.objectDesc : null) != null) {
                            arrayList.add(next);
                        }
                    }
                }
                if (arrayList != null) {
                    collection = new ArrayList(C36907w.m41090l(arrayList, 10));
                    for (FinderObject finderObject2 : arrayList) {
                        C56324a aVar = Companion;
                        C87412m.m108593f(finderObject2, "feed");
                        collection.add(((C64916p1) C86312j.m106911c(C64916p1.class)).B40(aVar.mo79056a(finderObject2, 1)));
                    }
                }
                List<BaseFinderFeed> list = this.foldedFeeds;
                if (collection == null) {
                    collection = C64186f0.f181907d;
                }
                list.addAll(collection);
            }
        }
        return this.foldedFeeds;
    }

    public final C48872bl0 getFoldedLayout() {
        return this.feedObject.foldedLayout;
    }

    public final int getFollowCount() {
        return this.feedObject.followCount;
    }

    public final int getForwardCount() {
        return this.feedObject.forwardCount;
    }

    public final int getFriendLikeCount() {
        return this.feedObject.friendLikeCount;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = (r0 = r0.fromApp).f183811i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getFromAppExtInfo() {
        /*
            r1 = this;
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r1.feedObject
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x000e
            te3.jl0 r0 = r0.fromApp
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.f183811i
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            java.lang.String r0 = ""
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.storage.FinderItem.getFromAppExtInfo():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = (r0 = r0.fromApp).f183806d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getFromAppId() {
        /*
            r1 = this;
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r1.feedObject
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x000e
            te3.jl0 r0 = r0.fromApp
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.f183806d
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            java.lang.String r0 = ""
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.storage.FinderItem.getFromAppId():java.lang.String");
    }

    public final int getFromType() {
        return this.fromType;
    }

    public final LinkedList<C64689rq2> getHalfVideoMediaExtList() {
        C64267br2 br22 = this.field_halfMediaExtList;
        LinkedList<C64689rq2> linkedList = br22 != null ? br22.f182328d : null;
        return linkedList == null ? new LinkedList<>() : linkedList;
    }

    public final long getId() {
        return this.field_id;
    }

    public final LinkedList<C51235sf0> getJumpAttachments() {
        Collection collection;
        LinkedList<C51235sf0> linkedList;
        LinkedList<C51235sf0> linkedList2 = new LinkedList<>();
        C51388tf0 tf02 = this.feedObject.attachmentList;
        if (tf02 == null || (linkedList = tf02.f142195d) == null) {
            collection = new LinkedList();
        } else {
            collection = new ArrayList();
            for (T next : linkedList) {
                if (((C51235sf0) next).f141468d == 3) {
                    collection.add(next);
                }
            }
        }
        linkedList2.addAll(collection);
        return linkedList2;
    }

    public final int getLikeCount() {
        return this.feedObject.likeCount;
    }

    public final int getLikeFlag() {
        return this.feedObject.likeFlag;
    }

    public final LinkedList<FinderCommentInfo> getLikeList() {
        LinkedList<FinderCommentInfo> linkedList = this.feedObject.likeList;
        C87412m.m108593f(linkedList, "feedObject.likeList");
        return linkedList;
    }

    public final C64689rq2 getLiveFinderMedia() {
        return this.liveFinderMedia;
    }

    public final C64273c21 getLiveInfo() {
        return this.feedObject.liveInfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.media;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.LinkedList<te3.C64689rq2> getLiveMediaList() {
        /*
            r1 = this;
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r1.feedObject
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x000f
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r0 = r0.media
            if (r0 == 0) goto L_0x000f
            java.util.LinkedList r0 = vp1.C65840n.m77567c(r0)
            goto L_0x0014
        L_0x000f:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.storage.FinderItem.getLiveMediaList():java.util.LinkedList");
    }

    public final long getLocalId() {
        return this.field_localId;
    }

    public final C64311db1 getLocation() {
        FinderObjectDesc finderObjectDesc = this.feedObject.objectDesc;
        C64311db1 db12 = finderObjectDesc != null ? finderObjectDesc.location : null;
        if (db12 != null) {
            return db12;
        }
        C64311db1 db13 = new C64311db1();
        db13.f182663f = "";
        db13.f182664g = "";
        return db13;
    }

    public final LinkedList<C64689rq2> getMediaExtList() {
        C64267br2 br22 = this.field_mediaExtList;
        LinkedList<C64689rq2> linkedList = br22 != null ? br22.f182328d : null;
        return linkedList == null ? new LinkedList<>() : linkedList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0091, code lost:
        r0 = r0.media;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.LinkedList<te3.C64689rq2> getMediaList() {
        /*
            r10 = this;
            int r0 = r10.mediaType
            r1 = 0
            r2 = 9
            if (r0 != r2) goto L_0x008b
            te3.rq2 r0 = r10.liveFinderMedia
            if (r0 != 0) goto L_0x007e
            te3.rq2 r0 = new te3.rq2
            r0.<init>()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r10.feedObject
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x001e
            te3.c21 r3 = r3.liveInfo
            if (r3 == 0) goto L_0x001e
            java.lang.String r3 = r3.f182395g
            if (r3 != 0) goto L_0x001f
        L_0x001e:
            r3 = r4
        L_0x001f:
            r0.f185266d = r3
            r0.f185268f = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.util.LinkedList r3 = r10.getLiveMediaList()
            java.lang.Object r3 = sx3.C110818d0.m150914L(r3)
            te3.rq2 r3 = (te3.C64689rq2) r3
            java.lang.String r3 = r3.f185267e
            r2.append(r3)
            java.util.LinkedList r3 = r10.getLiveMediaList()
            java.lang.Object r3 = sx3.C110818d0.m150914L(r3)
            te3.rq2 r3 = (te3.C64689rq2) r3
            java.lang.String r3 = r3.f185288z
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.f185267e = r2
            r2 = 0
            r0.f185269g = r2
            java.lang.String r3 = r0.f185266d
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r3)
            r0.f185275p = r3
            er1.j4 r3 = er1.C58739j4.f168176a
            java.lang.String r5 = r0.f185267e
            r3.getClass()
            if (r5 == 0) goto L_0x0068
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r5)
        L_0x0068:
            if (r1 != 0) goto L_0x006b
            r1 = r4
        L_0x006b:
            r0.f185285x0 = r1
            r1 = 1148846080(0x447a0000, float:1000.0)
            r0.f185270h = r1
            r1 = 1150410752(0x4491e000, float:1167.0)
            r0.f185271i = r1
            r0.f185272j = r4
            r0.f185273n = r2
            r0.f185274o = r2
            r10.liveFinderMedia = r0
        L_0x007e:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            te3.rq2 r1 = r10.liveFinderMedia
            if (r1 == 0) goto L_0x008a
            r0.add(r1)
        L_0x008a:
            return r0
        L_0x008b:
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r10.feedObject
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x009a
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r0 = r0.media
            if (r0 == 0) goto L_0x009a
            java.util.LinkedList r0 = vp1.C65840n.m77567c(r0)
            goto L_0x009f
        L_0x009a:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
        L_0x009f:
            java.lang.String r2 = TAG
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "getMediaList mediaExtList:"
            r3.append(r4)
            java.util.LinkedList r4 = r10.getMediaExtList()
            int r4 = r4.size()
            r3.append(r4)
            java.lang.String r4 = " specList:"
            r3.append(r4)
            java.lang.Object r4 = sx3.C110818d0.m150916N(r0)
            te3.rq2 r4 = (te3.C64689rq2) r4
            if (r4 == 0) goto L_0x0132
            java.util.LinkedList<te3.yb1> r4 = r4.f185282v
            if (r4 == 0) goto L_0x0132
            java.util.ArrayList r1 = new java.util.ArrayList
            r5 = 10
            int r5 = sx3.C36907w.m41090l(r4, r5)
            r1.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x00d6:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0132
            java.lang.Object r5 = r4.next()
            te3.yb1 r5 = (te3.C64850yb1) r5
            java.lang.String r6 = "it"
            gy3.C87412m.m108593f(r5, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Spec["
            r6.append(r7)
            java.lang.String r7 = r5.f186466d
            r6.append(r7)
            r7 = 32
            r6.append(r7)
            java.lang.String r8 = r5.f186469g
            r6.append(r8)
            r6.append(r7)
            int r8 = r5.f186467e
            long r8 = (long) r8
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r8)
            r6.append(r8)
            r6.append(r7)
            int r8 = r5.f186468f
            r6.append(r8)
            r6.append(r7)
            int r8 = r5.f186472j
            r6.append(r8)
            r6.append(r7)
            int r5 = r5.f186473n
            r6.append(r5)
            r5 = 93
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r1.add(r5)
            goto L_0x00d6
        L_0x0132:
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            java.util.LinkedList r1 = r10.getMediaExtList()
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x014a
            java.util.LinkedList r0 = r10.getMediaExtList()
        L_0x014a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.storage.FinderItem.getMediaList():java.util.LinkedList");
    }

    public final int getMediaType() {
        return this.mediaType;
    }

    public final int getMentionListSelected() {
        return this.feedObject.mentionedListSelected;
    }

    public final long getMsgId() {
        return this.msgId;
    }

    public final String getNickName() {
        String str = this.feedObject.nickname;
        if (str == null) {
            str = "";
        }
        C60216z4 l7 = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7();
        if (!l7.mo83767N5(this.feedObject)) {
            return str;
        }
        C52192z0 e6 = l7.mo83786e6(this.feedObject);
        String str2 = e6 != null ? e6.f145600d : null;
        return str2 == null ? str : str2;
    }

    public final SpannableString getNickNameSpan() {
        return this.nickNameSpan;
    }

    public final String getNotShareMsg() {
        String str = this.feedObject.sendShareFavWording;
        return str == null ? "" : str;
    }

    public final String getObjectNonceId() {
        String str = this.feedObject.objectNonceId;
        return str == null ? "" : str;
    }

    public final C7823k0 getPosTriggerConfig() {
        return this.posTriggerConfig;
    }

    public final C64736tq2 getPostInfo() {
        C64736tq2 tq22 = this.field_postinfo;
        return tq22 == null ? new C64736tq2() : tq22;
    }

    public final int getPrivate_flag() {
        return this.feedObject.privateFlag;
    }

    public final int getReadCount() {
        return this.feedObject.readCount;
    }

    public final FinderContact getRefObjectContact() {
        FinderContact finderContact = this.feedObject.refObjectContact;
        return finderContact == null ? new FinderContact() : finderContact;
    }

    public final long getRefObjectFlag() {
        return this.feedObject.refObjectFlag;
    }

    public final long getRefObjectId() {
        return this.feedObject.refObjectId;
    }

    public final long getRelatedFeedId() {
        return this.relatedFeedId;
    }

    public final boolean getShowExtendLink() {
        return this.showExtendLink;
    }

    public final int getStickyTime() {
        return this.feedObject.stickyTime;
    }

    public final long getTimestamps() {
        return this.timestamps;
    }

    public final C7840n getTopicClickExtra() {
        return this.topicClickExtra;
    }

    public final List<C58773q5> getTopicList() {
        return this.topicList;
    }

    public final String getUnsignedId() {
        return C61926c.m72691p(getId());
    }

    public final String getUserName() {
        String str = this.feedObject.username;
        return str == null ? "" : str;
    }

    public final String info() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("id:");
        sb.append(this.field_id);
        sb.append(" username ");
        sb.append(this.feedObject.username);
        sb.append(" mediaType ");
        sb.append(this.mediaType);
        sb.append(" localFlag ");
        sb.append(this.field_localFlag);
        sb.append(" description ");
        String description = getDescription();
        if (description != null) {
            str = description.substring(0, Math.min(description.length(), 3));
            C87412m.m108593f(str, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(" mediaList ");
        sb.append(C61937h.m72709h(getMediaList()));
        return sb.toString();
    }

    public final boolean isChosenComment() {
        return (this.feedObject.func_flag & 2) > 0;
    }

    public final boolean isCommentClose() {
        return this.feedObject.commentClose == 1;
    }

    public final boolean isDisableShowSetRingtoneBtn() {
        return (this.feedObject.func_flag & 16) > 0;
    }

    public final boolean isEnableShowSetRingtoneBtn() {
        return (this.feedObject.func_flag & 8) > 0;
    }

    public final boolean isEventClosed() {
        return (this.field_localFlag & 16) != 0;
    }

    public final boolean isEventExpired() {
        return (this.field_localFlag & 32) != 0;
    }

    public final boolean isLive() {
        return this.mediaType == 9;
    }

    public final boolean isLiveFeed() {
        return this.mediaType == 9;
    }

    public final boolean isLongVideo() {
        C50124kf1 kf12 = this.feedObject.object_extend;
        return ((kf12 != null ? kf12.f136747f : 0) & 1) > 0;
    }

    public final boolean isMvFeed() {
        return this.feedObject.objectType == 2;
    }

    public final boolean isNeedCrop(int i) {
        C64689rq2 cropInfo = getCropInfo(i);
        return cropInfo != null && cropInfo.f185280t;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if ((r3 != null && r3.f186905j) == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isNeedVideoCompositionPlay(int r3) {
        /*
            r2 = this;
            te3.rq2 r3 = r2.getCropInfo(r3)
            er1.j4 r0 = er1.C58739j4.f168176a
            r0.getClass()
            r0 = 0
            r1 = 1
            if (r3 == 0) goto L_0x001a
            te3.zy r3 = r3.f185235B
            if (r3 == 0) goto L_0x0017
            boolean r3 = r3.f186905j
            if (r3 != r1) goto L_0x0017
            r3 = 1
            goto L_0x0018
        L_0x0017:
            r3 = 0
        L_0x0018:
            if (r3 != 0) goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            r3 = r0 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.storage.FinderItem.isNeedVideoCompositionPlay(int):boolean");
    }

    public final boolean isNotShare() {
        return isNotShareSns() && isNotShareConversation();
    }

    public final boolean isNotShareConversation() {
        FinderObject finderObject = this.feedObject;
        int i = finderObject.objectStatus;
        return ((i & 1) == 0 && (i & 2) == 0 && (finderObject.permissionFlag & 128) == 0) ? false : true;
    }

    public final boolean isNotShareSns() {
        FinderObject finderObject = this.feedObject;
        int i = finderObject.objectStatus;
        return ((i & 1) == 0 && (i & 2) == 0 && (finderObject.permissionFlag & 1) == 0) ? false : true;
    }

    public final boolean isOldVersion() {
        return this.feedObject.secondaryShowFlag != 1;
    }

    public final boolean isOnlySelfSee() {
        return debugOnlySelfSee || (this.feedObject.objectStatus & 1) != 0;
    }

    public final boolean isPostFailed() {
        return (this.field_localFlag & 2) != 0;
    }

    public final boolean isPostFailedCanRetry() {
        return (this.field_localFlag & 4) == 0;
    }

    public final boolean isPostFinish() {
        return (this.field_localFlag & 3) == 0;
    }

    public final boolean isPostFromMP() {
        return (this.feedObject.func_flag & 64) > 0;
    }

    public final boolean isPostNoAuth() {
        return (this.field_localFlag & 8) != 0;
    }

    public final boolean isPreview() {
        return this.isPreview;
    }

    public final boolean isPrivate() {
        return this.feedObject.privateFlag == 1;
    }

    public final boolean isProductAttached() {
        C50124kf1 kf12 = this.feedObject.object_extend;
        return ((kf12 != null ? kf12.f136747f : 0) & 2) > 0;
    }

    public final boolean isProfileShowFromSns() {
        return (this.feedObject.func_flag & 32) > 0;
    }

    public final boolean isRelatedItem() {
        return this.isRelatedItem;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r0 = r0.f182363I;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isReplayLiveFeed() {
        /*
            r4 = this;
            boolean r0 = r4.isLiveFeed()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002a
            int r0 = ks3.C61160f.f174109a
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r4.feedObject
            te3.c21 r0 = r0.liveInfo
            if (r0 == 0) goto L_0x0017
            te3.e61 r0 = r0.f182363I
            if (r0 == 0) goto L_0x0017
            int r0 = r0.f182920d
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            r3 = 2
            if (r0 == r3) goto L_0x0026
            r3 = 8
            if (r0 == r3) goto L_0x0026
            r3 = 16
            if (r0 != r3) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r0 = 0
            goto L_0x0027
        L_0x0026:
            r0 = 1
        L_0x0027:
            if (r0 == 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r1 = 0
        L_0x002b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.storage.FinderItem.isReplayLiveFeed():boolean");
    }

    public final boolean isShowSetRingtoneBtn() {
        return (this.feedObject.func_flag & 4) > 0;
    }

    public final boolean isSupportCache() {
        return (this.feedObject.func_flag & 128) > 0;
    }

    public final boolean isUrlValid() {
        FinderObject finderObject = this.feedObject;
        C64827xe1 xe12 = finderObject.client_local_buffer;
        long j = xe12 != null ? xe12.f186293d : 0;
        boolean z = true;
        if (j == 0) {
            if (xe12 != null) {
                xe12.f186293d = C31543z5.m39453c();
            }
        } else if ((((long) finderObject.urlValidDuration) * 1000) + j <= C31543z5.m39453c()) {
            z = false;
        }
        String str = TAG;
        Log.m105924i(str, "isUrlValid: isUrlValid = " + z + ", feedRecTime = " + j + ", feedId = " + C61926c.m72691p(getId()));
        return z;
    }

    public final C64689rq2 mediaExt(String str) {
        LinkedList<C64689rq2> linkedList;
        C87412m.m108594g(str, "mediaId");
        C64267br2 br22 = this.field_mediaExtList;
        T t = null;
        if (br22 == null || (linkedList = br22.f182328d) == null) {
            return null;
        }
        Iterator<T> it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (C87412m.m108589b(((C64689rq2) next).f185275p, str)) {
                t = next;
                break;
            }
        }
        return (C64689rq2) t;
    }

    public final void setBizInfo(C64284cg cgVar) {
        this.bizInfo = cgVar;
    }

    public final void setCardDescLayout(C79150a aVar) {
        this.cardDescLayout = aVar;
    }

    public final void setClipListExt(LinkedList<FinderItem> linkedList) {
        LinkedList<C64783vq0> linkedList2;
        LinkedList<C64783vq0> linkedList3;
        C87412m.m108594g(linkedList, "value");
        this._clipListExt.clear();
        this._clipListExt.addAll(linkedList);
        if (this.field_clipList == null) {
            this.field_clipList = new C64532lq2();
        }
        C64532lq2 lq22 = this.field_clipList;
        if (!(lq22 == null || (linkedList3 = lq22.f184151d) == null)) {
            linkedList3.clear();
        }
        for (FinderItem finderItem : linkedList) {
            C64532lq2 lq23 = this.field_clipList;
            if (!(lq23 == null || (linkedList2 = lq23.f184151d) == null)) {
                linkedList2.add(Companion.mo79059e(finderItem));
            }
        }
    }

    public final void setCommentCount(int i) {
        Log.m105918d("Finder.FinderItem", "setCommentCount " + this.feedObject.hashCode() + ", from:" + getCommentCount() + ", to:" + getCommentCount());
        this.feedObject.commentCount = i;
    }

    public final void setCommentList(LinkedList<FinderCommentInfo> linkedList) {
        C87412m.m108594g(linkedList, "value");
        this.feedObject.commentList = linkedList;
    }

    public final void setCommentScene(int i) {
        this.commentScene = i;
    }

    public final void setComment_close(int i) {
        this.feedObject.commentClose = i;
    }

    public final void setCreateTime(int i) {
        this.feedObject.createtime = i;
    }

    public final void setCustomData(C50271lj0 lj02) {
        this.field_customData = lj02;
    }

    public final void setDescLayout(C79150a aVar) {
        this.descLayout = aVar;
    }

    public final void setDescription(String str) {
        String str2;
        C87412m.m108594g(str, "value");
        FinderObjectDesc finderObjectDesc = this.feedObject.objectDesc;
        if (finderObjectDesc != null) {
            int length = str.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    str2 = "";
                    break;
                }
                if (!(str.charAt(i) == 10)) {
                    str2 = str.substring(i);
                    C87412m.m108593f(str2, "this as java.lang.String).substring(startIndex)");
                    break;
                }
                i++;
            }
            finderObjectDesc.description = str2;
        }
        SpannableString T1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), str);
        this.descriptionSpan = T1;
        this.descriptionFullSpan = T1;
        Log.m105928w(TAG, "unexpecting write!");
    }

    public final void setDescriptionFullSpan(SpannableString spannableString) {
        this.descriptionFullSpan = spannableString;
    }

    public final void setDescriptionSpan(SpannableString spannableString) {
        this.descriptionSpan = spannableString;
    }

    public final void setEcSource(String str) {
        this.ecSource = str;
    }

    public final void setEventClosed() {
        this.field_localFlag |= 16;
    }

    public final void setEventExpired() {
        this.field_localFlag |= 32;
    }

    public final void setExtReading(C64472jk0 jk02) {
        C87412m.m108594g(jk02, "value");
        FinderObjectDesc finderObjectDesc = this.feedObject.objectDesc;
        if (finderObjectDesc != null) {
            finderObjectDesc.extReading = jk02;
        }
    }

    public final void setFavCount(int i) {
        this.feedObject.favCount = i;
    }

    public final void setFavFlag(int i) {
        this.feedObject.favFlag = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0033, code lost:
        r11 = r11.flow_card_desc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setFeedObject(com.tencent.p014mm.protocal.protobuf.FinderObject r11) {
        /*
            r10 = this;
            java.lang.Class<ny.h> r0 = p629ny.C76979h.class
            java.lang.String r1 = "value"
            gy3.C87412m.m108594g(r11, r1)
            er1.j4 r1 = er1.C58739j4.f168176a
            int r1 = r1.mo83711h(r11)
            r10.mediaType = r1
            int r1 = r11.createtime
            long r1 = (long) r1
            r10.field_createTime = r1
            long r1 = r11.f164794id
            r10.field_id = r1
            java.lang.String r1 = r11.username
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x0020
            r1 = r2
        L_0x0020:
            r10.field_username = r1
            r10.fixMediaType(r11)
            r10.feedObject = r11
            r10.field_finderObject = r11
            r10.updateNicknameAndDesc(r11)
            com.tencent.mm.protocal.protobuf.FinderObject r11 = r10.feedObject
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r11 = r11.objectDesc
            r1 = 0
            if (r11 == 0) goto L_0x003a
            te3.zk0 r11 = r11.flow_card_desc
            if (r11 == 0) goto L_0x003a
            java.lang.String r11 = r11.f146049d
            goto L_0x003b
        L_0x003a:
            r11 = r1
        L_0x003b:
            r3 = 0
            r4 = 1
            if (r11 == 0) goto L_0x0048
            int r11 = r11.length()
            if (r11 != 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r11 = 0
            goto L_0x0049
        L_0x0048:
            r11 = 1
        L_0x0049:
            if (r11 != 0) goto L_0x006b
            di3.d r11 = di3.C86312j.m106911c(r0)
            ny.h r11 = (p629ny.C76979h) r11
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            com.tencent.mm.protocal.protobuf.FinderObject r6 = r10.feedObject
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r6 = r6.objectDesc
            if (r6 == 0) goto L_0x0065
            te3.zk0 r6 = r6.flow_card_desc
            if (r6 == 0) goto L_0x0065
            java.lang.String r6 = r6.f146049d
            if (r6 != 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r2 = r6
        L_0x0065:
            android.text.SpannableString r11 = r11.mo107057T1(r5, r2)
            r10.flowCardDescSpan = r11
        L_0x006b:
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            float r11 = kg3.C76577a.m92165p(r11)
            r2 = 1097859072(0x41700000, float:15.0)
            float r11 = r11 * r2
            com.tencent.mm.ui.widget.MMNeat7extView r5 = preMeasuredTextView
            if (r5 != 0) goto L_0x00c6
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            long r5 = r5.getId()
            android.os.Looper r7 = android.os.Looper.getMainLooper()
            java.lang.Thread r7 = r7.getThread()
            long r7 = r7.getId()
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x00c6
            com.tencent.mm.ui.widget.MMNeat7extView r5 = new com.tencent.mm.ui.widget.MMNeat7extView
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r5.<init>(r6)
            r6 = 2
            r5.setMaxLines(r6)
            r5.mo154994l(r4, r2)
            android.text.TextPaint r2 = r5.getPaint()
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131826451(0x7f111713, float:1.9285787E38)
            java.lang.String r6 = r6.getString(r7)
            float r2 = r2.measureText(r6)
            r6 = 1066192077(0x3f8ccccd, float:1.1)
            float r2 = r2 * r6
            android.text.TextUtils$TruncateAt r6 = android.text.TextUtils.TruncateAt.END
            r5.mo154992j(r6, r2)
            preMeasuredTextView = r5
        L_0x00c6:
            com.tencent.mm.ui.widget.MMNeat7extView r2 = preMeasuredTextView
            if (r2 == 0) goto L_0x00cd
            r2.mo154994l(r4, r11)
        L_0x00cd:
            com.tencent.mm.ui.widget.MMNeat7extView r11 = preMeasuredTextView
            if (r11 == 0) goto L_0x00d6
            android.text.SpannableString r2 = r10.descriptionFullSpan
            r11.mo104279b(r2)
        L_0x00d6:
            com.tencent.mm.ui.widget.MMNeat7extView r11 = preMeasuredTextView
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r11 == 0) goto L_0x00e4
            int r5 = layoutWidth
            yr3.a r11 = r11.mo154990i(r5, r2)
            goto L_0x00e5
        L_0x00e4:
            r11 = r1
        L_0x00e5:
            r10.descLayout = r11
            android.text.SpannableString r11 = r10.flowCardDescSpan
            if (r11 == 0) goto L_0x00f1
            int r11 = r11.length()
            if (r11 != 0) goto L_0x00f2
        L_0x00f1:
            r3 = 1
        L_0x00f2:
            if (r3 != 0) goto L_0x0109
            com.tencent.mm.ui.widget.MMNeat7extView r11 = preMeasuredTextView
            if (r11 == 0) goto L_0x00fd
            android.text.SpannableString r3 = r10.flowCardDescSpan
            r11.mo104279b(r3)
        L_0x00fd:
            com.tencent.mm.ui.widget.MMNeat7extView r11 = preMeasuredTextView
            if (r11 == 0) goto L_0x0107
            int r1 = layoutWidth
            yr3.a r1 = r11.mo154990i(r1, r2)
        L_0x0107:
            r10.cardDescLayout = r1
        L_0x0109:
            er1.k0 r11 = new er1.k0
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r10.feedObject
            java.lang.String r1 = r1.posTriggerConfig
            r11.<init>(r1)
            r10.posTriggerConfig = r11
            int r11 = r10.fromType
            r1 = 16
            if (r11 == r1) goto L_0x0131
            di3.d r11 = di3.C86312j.m106911c(r0)
            ny.h r11 = (p629ny.C76979h) r11
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.text.SpannableString r1 = r10.descriptionFullSpan
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2 = 0
            android.text.SpannableString r11 = r11.Te0(r0, r1, r2)
            r10.descriptionSpan = r11
        L_0x0131:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.storage.FinderItem.setFeedObject(com.tencent.mm.protocal.protobuf.FinderObject):void");
    }

    public final void setFlowCardDescSpan(SpannableString spannableString) {
        this.flowCardDescSpan = spannableString;
    }

    public final void setFoldedLayout(C48872bl0 bl02) {
        this.foldedLayout = bl02;
    }

    public final void setFollowCount(int i) {
        this.feedObject.followCount = i;
    }

    public final void setForwardCount(int i) {
        this.feedObject.forwardCount = i;
    }

    public final void setFriendLikeCount(int i) {
        this.feedObject.friendLikeCount = i;
    }

    public final void setFromType(int i) {
        this.fromType = i;
    }

    public final void setHalfVideoMediaExtList(LinkedList<C64689rq2> linkedList) {
        C87412m.m108594g(linkedList, "value");
        if (this.field_halfMediaExtList == null) {
            this.field_halfMediaExtList = new C64267br2();
        }
        this.field_halfMediaExtList.f182328d = linkedList;
    }

    public final void setLikeCount(int i) {
        this.feedObject.likeCount = i;
    }

    public final void setLikeFlag(int i) {
        this.feedObject.likeFlag = i;
    }

    public final void setLikeList(LinkedList<FinderCommentInfo> linkedList) {
        C87412m.m108594g(linkedList, "value");
        this.feedObject.likeList = linkedList;
    }

    public final void setLiveFinderMedia(C64689rq2 rq22) {
        this.liveFinderMedia = rq22;
    }

    public final void setLiveInfo(C64273c21 c212) {
        this.feedObject.liveInfo = c212;
    }

    public final void setLocalId(long j) {
        this.field_localId = j;
    }

    public final void setLocation(C64311db1 db12) {
        C87412m.m108594g(db12, "value");
        FinderObjectDesc finderObjectDesc = this.feedObject.objectDesc;
        if (finderObjectDesc != null) {
            finderObjectDesc.location = db12;
        }
    }

    public final void setMediaExtList(LinkedList<C64689rq2> linkedList) {
        C87412m.m108594g(linkedList, "value");
        if (this.field_mediaExtList == null) {
            this.field_mediaExtList = new C64267br2();
        }
        this.field_mediaExtList.f182328d = linkedList;
    }

    public final void setMediaList(LinkedList<C64689rq2> linkedList) {
        C87412m.m108594g(linkedList, "value");
        String str = TAG;
        Log.m105928w(str, "setMediaList " + Util.getStack());
        FinderObjectDesc finderObjectDesc = this.feedObject.objectDesc;
        if (finderObjectDesc != null) {
            LinkedList<FinderMedia> linkedList2 = new LinkedList<>();
            for (C64689rq2 rq22 : linkedList) {
                C87412m.m108594g(rq22, "<this>");
                FinderMedia finderMedia = new FinderMedia();
                finderMedia.url = rq22.f185266d;
                finderMedia.thumbUrl = rq22.f185267e;
                finderMedia.mediaType = rq22.f185268f;
                finderMedia.videoDuration = rq22.f185269g;
                finderMedia.width = rq22.f185270h;
                finderMedia.height = rq22.f185271i;
                finderMedia.md5sum = rq22.f185272j;
                finderMedia.fileSize = rq22.f185273n;
                finderMedia.bitrate = rq22.f185274o;
                LinkedList<C64850yb1> linkedList3 = finderMedia.spec;
                linkedList3.clear();
                linkedList3.addAll(rq22.f185282v);
                finderMedia.coverUrl = rq22.f185283w;
                finderMedia.decodeKey = rq22.f185284x;
                finderMedia.url_token = rq22.f185286y;
                finderMedia.thumb_url_token = rq22.f185288z;
                finderMedia.cover_url_token = rq22.f185234A;
                finderMedia.codec_info = rq22.f185236C;
                C50435mq0 mq02 = new C50435mq0();
                mq02.f138150d.addAll(rq22.f185264Y);
                finderMedia.hls_spec = mq02;
                finderMedia.hot_flag = rq22.f185257U;
                finderMedia.half_rect = rq22.f185248P;
                finderMedia.full_thumb_url = rq22.f185239F;
                finderMedia.full_thumb_url_token = rq22.f185240G;
                finderMedia.full_url = rq22.f185242I;
                finderMedia.full_width = rq22.f185243J;
                finderMedia.full_height = rq22.f185244K;
                finderMedia.full_md5sum = rq22.f185245L;
                finderMedia.full_file_size = rq22.f185246M;
                finderMedia.full_bitrate = rq22.f185247N;
                finderMedia.card_show_style = rq22.f185256T0;
                C64475jq0 jq02 = new C64475jq0();
                LinkedList<C64850yb1> linkedList4 = jq02.f183817d;
                linkedList4.addAll(linkedList4);
                finderMedia.hdr_spec = jq02;
                linkedList2.add(finderMedia);
            }
            finderObjectDesc.media = linkedList2;
        }
        if (this.feedObject.f164794id == 0) {
            setMediaExtList(linkedList);
        }
    }

    public final void setMediaType(int i) {
        this.mediaType = i;
    }

    public final void setMentionListSelected(int i) {
        this.feedObject.mentionedListSelected = i;
    }

    public final void setMsgId(long j) {
        this.msgId = j;
    }

    public final void setNickName(String str) {
        C87412m.m108594g(str, "value");
        this.feedObject.nickname = str;
        this.nickNameSpan = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), str);
    }

    public final void setNickNameSpan(SpannableString spannableString) {
        this.nickNameSpan = spannableString;
    }

    public final void setObjectNonceId(String str) {
        C87412m.m108594g(str, "value");
        this.feedObject.objectNonceId = str;
    }

    public final void setPosTriggerConfig(C7823k0 k0Var) {
        this.posTriggerConfig = k0Var;
    }

    public final void setPostFailed() {
        this.field_localFlag = (this.field_localFlag | 2) & -2;
    }

    public final void setPostFailedAndNoAuth() {
        setPostFailed();
        this.field_localFlag |= 8;
    }

    public final void setPostFailedAndNotRetry(int i) {
        setPostFailed();
        this.field_localFlag |= 4;
        if (i == -4065) {
            setEventExpired();
        } else if (i == -4059) {
            setEventClosed();
        }
    }

    public final void setPostFinish() {
        this.field_localFlag = this.field_localFlag & -2 & -3;
    }

    public final void setPostInfo(C64736tq2 tq22) {
        C87412m.m108594g(tq22, "field_postinfo");
        this.field_postinfo = tq22;
    }

    public final void setPostWaiting() {
        this.field_localFlag = 1;
    }

    public final void setPreview(boolean z) {
        this.isPreview = z;
    }

    public final void setPrivate_flag(int i) {
        this.feedObject.privateFlag = i;
    }

    public final void setReadCount(int i) {
        this.feedObject.readCount = i;
    }

    public final void setRefObjectContact(FinderContact finderContact) {
        C87412m.m108594g(finderContact, "value");
        this.feedObject.refObjectContact = finderContact;
    }

    public final void setRefObjectFlag(long j) {
        this.feedObject.refObjectFlag = j;
    }

    public final void setRefObjectId(long j) {
        this.feedObject.refObjectId = j;
    }

    public final void setRelatedFeedId(long j) {
        this.relatedFeedId = j;
    }

    public final void setRelatedItem(boolean z) {
        this.isRelatedItem = z;
    }

    public final void setShowExtendLink(boolean z) {
        this.showExtendLink = z;
    }

    public final void setStickyTime(int i) {
        this.feedObject.stickyTime = i;
    }

    public final void setTopicClickExtra(C7840n nVar) {
        C87412m.m108594g(nVar, "<set-?>");
        this.topicClickExtra = nVar;
    }

    public final void setUserName(String str) {
        C87412m.m108594g(str, "value");
        this.feedObject.username = str;
    }

    public final void trackDraftPost(String str) {
        C87412m.m108594g(str, IXWebBroadcastListener.STAGE_TAG);
        try {
            C64736tq2 tq22 = this.field_postinfo;
            C13598b0 b0Var = null;
            if (tq22 != null) {
                String str2 = "localId:" + getLocalId() + ", localFlag:" + this.field_localFlag + ", uploadState:" + tq22.f185647f + ", tryCount:" + tq22.f185646e + ", utilNow:" + (C31543z5.m39451a() - tq22.f185651j) + "ms, mediaProcessCost:" + tq22.f185653o + "ms, uploadCost:" + tq22.f185654p + "ms, doSceneCost:" + tq22.f185655q + "ms, totalCost:" + tq22.f185652n + LocaleUtil.MALAY;
                String str3 = "localId:" + getLocalId() + ", mediaList: ";
                int i = 0;
                for (T next : getMediaExtList()) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        C64689rq2 rq22 = (C64689rq2) next;
                        str3 = str3 + "Index" + i + ", fileSize:" + ((((float) C86013q1.m106451l(rq22.f185266d)) / 1024.0f) / 1024.0f) + "MB, mediaType:" + rq22.f185268f + "; ";
                        i = i2;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                Log.m105924i("Finder.DraftPostLog", "stage:" + str + ' ' + str2);
                Log.m105924i("Finder.DraftPostLog", "stage:" + str + ' ' + str3);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Log.m105924i("Finder.DraftPostLog", "stage:" + str + " localId:" + getLocalId() + ", postInfo is null");
            }
        } catch (Throwable th) {
            Log.m105924i("Finder.DraftPostLog", "exception: " + th);
        }
    }

    public final void trackPost(String str) {
        C87412m.m108594g(str, IXWebBroadcastListener.STAGE_TAG);
        try {
            C64736tq2 tq22 = this.field_postinfo;
            C13598b0 b0Var = null;
            if (tq22 != null) {
                String str2 = "localId:" + getLocalId() + ", localFlag:" + this.field_localFlag + ", uploadState:" + tq22.f185647f + ", tryCount:" + tq22.f185646e + ", utilNow:" + (C31543z5.m39451a() - tq22.f185651j) + "ms, mediaProcessCost:" + tq22.f185653o + "ms, uploadCost:" + tq22.f185654p + "ms, doSceneCost:" + tq22.f185655q + "ms, totalCost:" + tq22.f185652n + LocaleUtil.MALAY;
                String str3 = "localId:" + getLocalId() + ", mediaList: ";
                int i = 0;
                for (T next : getMediaExtList()) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        C64689rq2 rq22 = (C64689rq2) next;
                        str3 = str3 + "Index" + i + ", fileSize:" + ((((float) C86013q1.m106451l(rq22.f185266d)) / 1024.0f) / 1024.0f) + "MB, mediaType:" + rq22.f185268f + "; ";
                        i = i2;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                Log.m105924i("Finder.PostLog", "stage:" + str + ' ' + str2);
                Log.m105924i("Finder.PostLog", "stage:" + str + ' ' + str3);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Log.m105924i("Finder.PostLog", "stage:" + str + " localId:" + getLocalId() + ", postInfo is null");
            }
        } catch (Throwable th) {
            Log.m105924i("Finder.PostLog", "exception: " + th);
        }
    }

    public final void updateFinderObject(FinderObject finderObject) {
        C87412m.m108594g(finderObject, "svrFeed");
        this.field_username = finderObject.username;
        this.field_finderObject = finderObject;
        setFeedObject(finderObject);
        this.field_id = finderObject.f164794id;
        this.field_createTime = (long) finderObject.createtime;
    }

    public final void updateNicknameAndDesc() {
        updateNicknameAndDesc(this.feedObject);
    }

    /* renamed from: getCreateTime  reason: collision with other method in class */
    public final long m168877getCreateTime() {
        return this.field_createTime;
    }

    public final void updateNicknameAndDesc(FinderObject finderObject) {
        String str;
        String str2;
        String str3;
        C52192z0 e6;
        String str4;
        Class cls = C64916p1.class;
        Class cls2 = C76979h.class;
        C87412m.m108594g(finderObject, "obj");
        C64284cg bizInfoByObject = getBizInfoByObject(finderObject);
        if (bizInfoByObject == null || (str = bizInfoByObject.f182469e) == null) {
            str = finderObject.nickname;
        }
        C60216z4 l7 = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7();
        if (!(!l7.mo83767N5(this.feedObject) || (e6 = l7.mo83786e6(this.feedObject)) == null || (str4 = e6.f145600d) == null)) {
            str = str4;
        }
        String str5 = "";
        if (this.fromType == 16) {
            C76979h hVar = (C76979h) C86312j.m106911c(cls2);
            Context context = MMApplicationContext.getContext();
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
            C64916p1 p1Var = (C64916p1) c;
            if (str == null) {
                str = str5;
            }
            this.nickNameSpan = hVar.Te0(context, p1Var.t50(str, str5), 0.0f);
            C76979h hVar2 = (C76979h) C86312j.m106911c(cls2);
            Context context2 = MMApplicationContext.getContext();
            C64916p1 p1Var2 = (C64916p1) C86312j.m106911c(cls);
            FinderObjectDesc finderObjectDesc = finderObject.objectDesc;
            if (!(finderObjectDesc == null || (str3 = finderObjectDesc.description) == null)) {
                str5 = str3;
            }
            this.descriptionSpan = hVar2.yp0(context2, p1Var2.du0(str5), 0.0f);
        } else {
            C76979h hVar3 = (C76979h) C86312j.m106911c(cls2);
            Context context3 = MMApplicationContext.getContext();
            if (str == null) {
                str = str5;
            }
            this.nickNameSpan = hVar3.mo107057T1(context3, str);
            C76979h hVar4 = (C76979h) C86312j.m106911c(cls2);
            Context context4 = MMApplicationContext.getContext();
            FinderObjectDesc finderObjectDesc2 = finderObject.objectDesc;
            if (!(finderObjectDesc2 == null || (str2 = finderObjectDesc2.description) == null)) {
                str5 = str2;
            }
            this.descriptionSpan = hVar4.mo107057T1(context4, str5);
        }
        this.descriptionFullSpan = createDescriptionFullSpan();
    }
}
