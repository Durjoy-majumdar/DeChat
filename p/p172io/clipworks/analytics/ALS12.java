package p172io.clipworks.analytics;

import com.google.protobuf.C16976a1;
import com.google.protobuf.C16985b1;
import com.google.protobuf.C16994k;
import com.google.protobuf.C23803a;
import com.google.protobuf.C23806a0;
import com.google.protobuf.C23810b;
import com.google.protobuf.C23813c;
import com.google.protobuf.C23836g1;
import com.google.protobuf.C23845j1;
import com.google.protobuf.C23856l;
import com.google.protobuf.C23872m0;
import com.google.protobuf.C23896m1;
import com.google.protobuf.C23897n;
import com.google.protobuf.C23908o0;
import com.google.protobuf.C23922p0;
import com.google.protobuf.C24020s2;
import com.google.protobuf.C24025t;
import com.google.protobuf.C24062w1;
import com.google.protobuf.C24071y;
import com.google.protobuf.C24074y0;
import com.google.protobuf.C24087z2;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82986r;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.clipworks.analytics.ALS12 */
public final class ALS12 {
    private static C24025t.C24038h descriptor = C24025t.C24038h.m29872i(new String[]{"\n\u000bALS12.proto\u0012\u0005ALS12\"Ð\u0001\n\u000eAnalyticsEvent\u0012\f\n\u0004time\u0018\u0001 \u0001(\u0004\u0012\u0011\n\ttimestamp\u0018\u0002 \u0001(\u0004\u0012\f\n\u0004name\u0018\u0003 \u0001(\t\u00121\n\u0006params\u0018\u0004 \u0003(\u000b2!.ALS12.AnalyticsEvent.ParamsEntry\u0012\u0016\n\u000eglobal_seq_num\u0018\u0005 \u0001(\u0005\u0012\u0015\n\rlocal_seq_num\u0018\u0006 \u0001(\u0005\u001a-\n\u000bParamsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001B\u001f\n\u0016io.clipworks.analyticsB\u0005ALS12b\u0006proto3"}, new C24025t.C24038h[0]);
    /* access modifiers changed from: private */
    public static final C24025t.C24027b internal_static_ALS12_AnalyticsEvent_ParamsEntry_descriptor;

    /* renamed from: internal_static_ALS12_AnalyticsEvent_ParamsEntry_fieldAccessorTable */
    private static final C23872m0.C23880f f70232x42f80dc6;
    /* access modifiers changed from: private */
    public static final C24025t.C24027b internal_static_ALS12_AnalyticsEvent_descriptor;
    /* access modifiers changed from: private */
    public static final C23872m0.C23880f internal_static_ALS12_AnalyticsEvent_fieldAccessorTable;

    /* renamed from: io.clipworks.analytics.ALS12$AnalyticsEvent */
    public static final class AnalyticsEvent extends C23872m0 implements AnalyticsEventOrBuilder {
        private static final AnalyticsEvent DEFAULT_INSTANCE = new AnalyticsEvent();
        public static final int GLOBAL_SEQ_NUM_FIELD_NUMBER = 5;
        public static final int LOCAL_SEQ_NUM_FIELD_NUMBER = 6;
        public static final int NAME_FIELD_NUMBER = 3;
        public static final int PARAMS_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final C24062w1<AnalyticsEvent> PARSER = new C23813c<AnalyticsEvent>() {
            public AnalyticsEvent parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                return new AnalyticsEvent(lVar, a0Var);
            }
        };
        public static final int TIMESTAMP_FIELD_NUMBER = 2;
        public static final int TIME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public int globalSeqNum_;
        /* access modifiers changed from: private */
        public int localSeqNum_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object name_;
        /* access modifiers changed from: private */
        public C16976a1<String, String> params_;
        /* access modifiers changed from: private */
        public long time_;
        /* access modifiers changed from: private */
        public long timestamp_;

        /* renamed from: io.clipworks.analytics.ALS12$AnalyticsEvent$ParamsDefaultEntryHolder */
        public static final class ParamsDefaultEntryHolder {
            public static final C24074y0<String, String> defaultEntry;

            static {
                C24025t.C24027b access$200 = ALS12.internal_static_ALS12_AnalyticsEvent_ParamsEntry_descriptor;
                C24087z2.C24089b bVar = C24087z2.C24089b.STRING;
                defaultEntry = new C24074y0(access$200, bVar, "", bVar, "");
            }

            private ParamsDefaultEntryHolder() {
            }
        }

        public static AnalyticsEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C24025t.C24027b getDescriptor() {
            return ALS12.internal_static_ALS12_AnalyticsEvent_descriptor;
        }

        /* access modifiers changed from: private */
        public C16976a1<String, String> internalGetParams() {
            C16976a1<String, String> a1Var = this.params_;
            return a1Var == null ? new C16976a1<>(ParamsDefaultEntryHolder.defaultEntry, C16976a1.C16983d.MAP, Collections.emptyMap()) : a1Var;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AnalyticsEvent parseDelimitedFrom(InputStream inputStream) {
            return (AnalyticsEvent) C23872m0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AnalyticsEvent parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static C24062w1<AnalyticsEvent> parser() {
            return PARSER;
        }

        public boolean containsParams(String str) {
            str.getClass();
            return internalGetParams().mo18655e().containsKey(str);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AnalyticsEvent)) {
                return super.equals(obj);
            }
            AnalyticsEvent analyticsEvent = (AnalyticsEvent) obj;
            return getTime() == analyticsEvent.getTime() && getTimestamp() == analyticsEvent.getTimestamp() && getName().equals(analyticsEvent.getName()) && internalGetParams().equals(analyticsEvent.internalGetParams()) && getGlobalSeqNum() == analyticsEvent.getGlobalSeqNum() && getLocalSeqNum() == analyticsEvent.getLocalSeqNum() && this.unknownFields.equals(analyticsEvent.unknownFields);
        }

        public int getGlobalSeqNum() {
            return this.globalSeqNum_;
        }

        public int getLocalSeqNum() {
            return this.localSeqNum_;
        }

        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String u = ((C16994k) obj).mo18752u();
            this.name_ = u;
            return u;
        }

        public C16994k getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (C16994k) obj;
            }
            C16994k k = C16994k.m16791k((String) obj);
            this.name_ = k;
            return k;
        }

        @Deprecated
        public Map<String, String> getParams() {
            return getParamsMap();
        }

        public int getParamsCount() {
            return internalGetParams().mo18655e().size();
        }

        public Map<String, String> getParamsMap() {
            return internalGetParams().mo18655e();
        }

        public String getParamsOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> e = internalGetParams().mo18655e();
            return e.containsKey(str) ? e.get(str) : str2;
        }

        public String getParamsOrThrow(String str) {
            str.getClass();
            Map<String, String> e = internalGetParams().mo18655e();
            if (e.containsKey(str)) {
                return e.get(str);
            }
            throw new IllegalArgumentException();
        }

        public C24062w1<AnalyticsEvent> getParserForType() {
            return PARSER;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            long j = this.time_;
            if (j != 0) {
                i2 = 0 + C23897n.m29280y(1, j);
            }
            long j2 = this.timestamp_;
            if (j2 != 0) {
                i2 += C23897n.m29280y(2, j2);
            }
            if (!getNameBytes().isEmpty()) {
                i2 += C23872m0.computeStringSize(3, this.name_);
            }
            for (Map.Entry next : internalGetParams().mo18655e().entrySet()) {
                C24074y0.C24075b<String, String> b = ParamsDefaultEntryHolder.defaultEntry.newBuilderForType();
                b.f69210e = next.getKey();
                b.f69212g = true;
                b.f69211f = next.getValue();
                b.f69213h = true;
                i2 += C23897n.m29270o(4, b.build());
            }
            int i3 = this.globalSeqNum_;
            if (i3 != 0) {
                i2 += C23897n.m29266k(5, i3);
            }
            int i4 = this.localSeqNum_;
            if (i4 != 0) {
                i2 += C23897n.m29266k(6, i4);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public long getTime() {
            return this.time_;
        }

        public long getTimestamp() {
            return this.timestamp_;
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = ((((((((((((C82986r.CTRL_INDEX + getDescriptor().hashCode()) * 37) + 1) * 53) + C23908o0.m29424b(getTime())) * 37) + 2) * 53) + C23908o0.m29424b(getTimestamp())) * 37) + 3) * 53) + getName().hashCode();
            if (!internalGetParams().mo18655e().isEmpty()) {
                hashCode = (((hashCode * 37) + 4) * 53) + internalGetParams().hashCode();
            }
            int globalSeqNum = (((((((((hashCode * 37) + 5) * 53) + getGlobalSeqNum()) * 37) + 6) * 53) + getLocalSeqNum()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = globalSeqNum;
            return globalSeqNum;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f access$100 = ALS12.internal_static_ALS12_AnalyticsEvent_fieldAccessorTable;
            access$100.mo37875c(AnalyticsEvent.class, Builder.class);
            return access$100;
        }

        public C16976a1 internalGetMapField(int i) {
            if (i == 4) {
                return internalGetParams();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new AnalyticsEvent();
        }

        public void writeTo(C23897n nVar) {
            long j = this.time_;
            if (j != 0) {
                nVar.mo37919Z(1, j);
            }
            long j2 = this.timestamp_;
            if (j2 != 0) {
                nVar.mo37919Z(2, j2);
            }
            if (!getNameBytes().isEmpty()) {
                C23872m0.writeString(nVar, 3, this.name_);
            }
            C23872m0.serializeStringMapTo(nVar, internalGetParams(), ParamsDefaultEntryHolder.defaultEntry, 4);
            int i = this.globalSeqNum_;
            if (i != 0) {
                nVar.mo37907N(5, i);
            }
            int i2 = this.localSeqNum_;
            if (i2 != 0) {
                nVar.mo37907N(6, i2);
            }
            this.unknownFields.writeTo(nVar);
        }

        /* renamed from: io.clipworks.analytics.ALS12$AnalyticsEvent$Builder */
        public static final class Builder extends C23872m0.C23874b<Builder> implements AnalyticsEventOrBuilder {
            private int bitField0_;
            private int globalSeqNum_;
            private int localSeqNum_;
            private Object name_;
            private C16976a1<String, String> params_;
            private long time_;
            private long timestamp_;

            public static final C24025t.C24027b getDescriptor() {
                return ALS12.internal_static_ALS12_AnalyticsEvent_descriptor;
            }

            private C16976a1<String, String> internalGetMutableParams() {
                C16976a1.C16983d dVar = C16976a1.C16983d.MAP;
                onChanged();
                if (this.params_ == null) {
                    this.params_ = new C16976a1<>(ParamsDefaultEntryHolder.defaultEntry, dVar, new LinkedHashMap());
                }
                if (!this.params_.f45972a) {
                    C16976a1<String, String> a1Var = this.params_;
                    this.params_ = new C16976a1<>(a1Var.f45976e, dVar, C16985b1.m16766c(a1Var.mo18655e()));
                }
                return this.params_;
            }

            private C16976a1<String, String> internalGetParams() {
                C16976a1<String, String> a1Var = this.params_;
                return a1Var == null ? new C16976a1<>(ParamsDefaultEntryHolder.defaultEntry, C16976a1.C16983d.MAP, Collections.emptyMap()) : a1Var;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = C23872m0.alwaysUseFieldBuilders;
            }

            public Builder clearGlobalSeqNum() {
                this.globalSeqNum_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLocalSeqNum() {
                this.localSeqNum_ = 0;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.name_ = AnalyticsEvent.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public Builder clearParams() {
                ((C16976a1.C16979c) internalGetMutableParams().mo18658g()).clear();
                return this;
            }

            public Builder clearTime() {
                this.time_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTimestamp() {
                this.timestamp_ = 0;
                onChanged();
                return this;
            }

            public boolean containsParams(String str) {
                str.getClass();
                return internalGetParams().mo18655e().containsKey(str);
            }

            public C24025t.C24027b getDescriptorForType() {
                return ALS12.internal_static_ALS12_AnalyticsEvent_descriptor;
            }

            public int getGlobalSeqNum() {
                return this.globalSeqNum_;
            }

            public int getLocalSeqNum() {
                return this.localSeqNum_;
            }

            @Deprecated
            public Map<String, String> getMutableParams() {
                return internalGetMutableParams().mo18658g();
            }

            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String u = ((C16994k) obj).mo18752u();
                this.name_ = u;
                return u;
            }

            public C16994k getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (C16994k) obj;
                }
                C16994k k = C16994k.m16791k((String) obj);
                this.name_ = k;
                return k;
            }

            @Deprecated
            public Map<String, String> getParams() {
                return getParamsMap();
            }

            public int getParamsCount() {
                return internalGetParams().mo18655e().size();
            }

            public Map<String, String> getParamsMap() {
                return internalGetParams().mo18655e();
            }

            public String getParamsOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> e = internalGetParams().mo18655e();
                return e.containsKey(str) ? e.get(str) : str2;
            }

            public String getParamsOrThrow(String str) {
                str.getClass();
                Map<String, String> e = internalGetParams().mo18655e();
                if (e.containsKey(str)) {
                    return e.get(str);
                }
                throw new IllegalArgumentException();
            }

            public long getTime() {
                return this.time_;
            }

            public long getTimestamp() {
                return this.timestamp_;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f access$100 = ALS12.internal_static_ALS12_AnalyticsEvent_fieldAccessorTable;
                access$100.mo37875c(AnalyticsEvent.class, Builder.class);
                return access$100;
            }

            public C16976a1 internalGetMapField(int i) {
                if (i == 4) {
                    return internalGetParams();
                }
                throw new RuntimeException("Invalid map field number: " + i);
            }

            public C16976a1 internalGetMutableMapField(int i) {
                if (i == 4) {
                    return internalGetMutableParams();
                }
                throw new RuntimeException("Invalid map field number: " + i);
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder putAllParams(Map<String, String> map) {
                ((C16976a1.C16979c) internalGetMutableParams().mo18658g()).putAll(map);
                return this;
            }

            public Builder putParams(String str, String str2) {
                str.getClass();
                str2.getClass();
                ((C16976a1.C16979c) internalGetMutableParams().mo18658g()).put(str, str2);
                return this;
            }

            public Builder removeParams(String str) {
                str.getClass();
                ((C16976a1.C16979c) internalGetMutableParams().mo18658g()).remove(str);
                return this;
            }

            public Builder setGlobalSeqNum(int i) {
                this.globalSeqNum_ = i;
                onChanged();
                return this;
            }

            public Builder setLocalSeqNum(int i) {
                this.localSeqNum_ = i;
                onChanged();
                return this;
            }

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                onChanged();
                return this;
            }

            public Builder setNameBytes(C16994k kVar) {
                kVar.getClass();
                C23810b.checkByteStringIsUtf8(kVar);
                this.name_ = kVar;
                onChanged();
                return this;
            }

            public Builder setTime(long j) {
                this.time_ = j;
                onChanged();
                return this;
            }

            public Builder setTimestamp(long j) {
                this.timestamp_ = j;
                onChanged();
                return this;
            }

            private Builder() {
                this.name_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            public AnalyticsEvent build() {
                AnalyticsEvent buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw C23803a.C23804a.newUninitializedMessageException(buildPartial);
            }

            public AnalyticsEvent buildPartial() {
                AnalyticsEvent analyticsEvent = new AnalyticsEvent((C23872m0.C23874b) this);
                long unused = analyticsEvent.time_ = this.time_;
                long unused2 = analyticsEvent.timestamp_ = this.timestamp_;
                Object unused3 = analyticsEvent.name_ = this.name_;
                C16976a1 unused4 = analyticsEvent.params_ = internalGetParams();
                analyticsEvent.params_.f45972a = false;
                int unused5 = analyticsEvent.globalSeqNum_ = this.globalSeqNum_;
                int unused6 = analyticsEvent.localSeqNum_ = this.localSeqNum_;
                onBuilt();
                return analyticsEvent;
            }

            public Builder clearField(C24025t.C24035g gVar) {
                return (Builder) super.clearField(gVar);
            }

            public AnalyticsEvent getDefaultInstanceForType() {
                return AnalyticsEvent.getDefaultInstance();
            }

            public Builder setField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            public Builder setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i, obj);
            }

            public final Builder setUnknownFields(C24020s2 s2Var) {
                return (Builder) super.setUnknownFields(s2Var);
            }

            public Builder clearOneof(C24025t.C24042k kVar) {
                return (Builder) super.clearOneof(kVar);
            }

            public final Builder mergeUnknownFields(C24020s2 s2Var) {
                return (Builder) super.mergeUnknownFields(s2Var);
            }

            public Builder clear() {
                super.clear();
                this.time_ = 0;
                this.timestamp_ = 0;
                this.name_ = "";
                C16976a1<String, String> internalGetMutableParams = internalGetMutableParams();
                internalGetMutableParams.getClass();
                internalGetMutableParams.f45974c = new C16976a1.C16979c<>(internalGetMutableParams, new LinkedHashMap());
                internalGetMutableParams.f45973b = C16976a1.C16983d.MAP;
                this.globalSeqNum_ = 0;
                this.localSeqNum_ = 0;
                return this;
            }

            private Builder(C23872m0.C23876c cVar) {
                super(cVar);
                this.name_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof AnalyticsEvent) {
                    return mergeFrom((AnalyticsEvent) g1Var);
                }
                super.mergeFrom(g1Var);
                return this;
            }

            public Builder mergeFrom(AnalyticsEvent analyticsEvent) {
                if (analyticsEvent == AnalyticsEvent.getDefaultInstance()) {
                    return this;
                }
                if (analyticsEvent.getTime() != 0) {
                    setTime(analyticsEvent.getTime());
                }
                if (analyticsEvent.getTimestamp() != 0) {
                    setTimestamp(analyticsEvent.getTimestamp());
                }
                if (!analyticsEvent.getName().isEmpty()) {
                    this.name_ = analyticsEvent.name_;
                    onChanged();
                }
                C16976a1<String, String> internalGetMutableParams = internalGetMutableParams();
                C16976a1 access$1300 = analyticsEvent.internalGetParams();
                ((C16976a1.C16979c) internalGetMutableParams.mo18658g()).putAll(C16985b1.m16766c(access$1300.mo18655e()));
                if (analyticsEvent.getGlobalSeqNum() != 0) {
                    setGlobalSeqNum(analyticsEvent.getGlobalSeqNum());
                }
                if (analyticsEvent.getLocalSeqNum() != 0) {
                    setLocalSeqNum(analyticsEvent.getLocalSeqNum());
                }
                mergeUnknownFields(analyticsEvent.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public p172io.clipworks.analytics.ALS12.AnalyticsEvent.Builder mergeFrom(com.google.protobuf.C23856l r3, com.google.protobuf.C23806a0 r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.w1 r1 = p172io.clipworks.analytics.ALS12.AnalyticsEvent.PARSER     // Catch:{ p0 -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch:{ p0 -> 0x0013 }
                    io.clipworks.analytics.ALS12$AnalyticsEvent r3 = (p172io.clipworks.analytics.ALS12.AnalyticsEvent) r3     // Catch:{ p0 -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((p172io.clipworks.analytics.ALS12.AnalyticsEvent) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.j1 r4 = r3.f68530d     // Catch:{ all -> 0x0011 }
                    io.clipworks.analytics.ALS12$AnalyticsEvent r4 = (p172io.clipworks.analytics.ALS12.AnalyticsEvent) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.mo38013j()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((p172io.clipworks.analytics.ALS12.AnalyticsEvent) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: p172io.clipworks.analytics.ALS12.AnalyticsEvent.Builder.mergeFrom(com.google.protobuf.l, com.google.protobuf.a0):io.clipworks.analytics.ALS12$AnalyticsEvent$Builder");
            }
        }

        public static Builder newBuilder(AnalyticsEvent analyticsEvent) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(analyticsEvent);
        }

        public static AnalyticsEvent parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return PARSER.parseFrom(byteBuffer, a0Var);
        }

        private AnalyticsEvent(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
        }

        public static AnalyticsEvent parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (AnalyticsEvent) C23872m0.parseDelimitedWithIOException(PARSER, inputStream, a0Var);
        }

        public static AnalyticsEvent parseFrom(C16994k kVar) {
            return PARSER.parseFrom(kVar);
        }

        public AnalyticsEvent getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static AnalyticsEvent parseFrom(C16994k kVar, C23806a0 a0Var) {
            return PARSER.parseFrom(kVar, a0Var);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        private AnalyticsEvent() {
            this.memoizedIsInitialized = -1;
            this.name_ = "";
        }

        public static AnalyticsEvent parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public Builder newBuilderForType(C23872m0.C23876c cVar) {
            return new Builder(cVar);
        }

        public static AnalyticsEvent parseFrom(byte[] bArr, C23806a0 a0Var) {
            return PARSER.parseFrom(bArr, a0Var);
        }

        public static AnalyticsEvent parseFrom(InputStream inputStream) {
            return (AnalyticsEvent) C23872m0.parseWithIOException(PARSER, inputStream);
        }

        private AnalyticsEvent(C23856l lVar, C23806a0 a0Var) {
            this();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    if (F != 0) {
                        if (F == 8) {
                            this.time_ = lVar.mo37759H();
                        } else if (F == 16) {
                            this.timestamp_ = lVar.mo37759H();
                        } else if (F == 26) {
                            this.name_ = lVar.mo37756E();
                        } else if (F == 34) {
                            if (!z2 || !true) {
                                this.params_ = new C16976a1<>(ParamsDefaultEntryHolder.defaultEntry, C16976a1.C16983d.MAP, new LinkedHashMap());
                                z2 |= true;
                            }
                            C24074y0 y0Var = (C24074y0) lVar.mo37777v(ParamsDefaultEntryHolder.defaultEntry.f69207f.f69215f, a0Var);
                            ((C16976a1.C16979c) this.params_.mo18658g()).put(y0Var.f69205d, y0Var.f69206e);
                        } else if (F == 40) {
                            this.globalSeqNum_ = lVar.mo37775t();
                        } else if (F == 48) {
                            this.localSeqNum_ = lVar.mo37775t();
                        } else if (!parseUnknownField(lVar, b, a0Var, F)) {
                        }
                    }
                    z = true;
                } catch (C23922p0 e) {
                    e.f68530d = this;
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = this;
                    throw p0Var;
                } catch (Throwable th) {
                    this.unknownFields = b.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = b.build();
            makeExtensionsImmutable();
        }

        public static AnalyticsEvent parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (AnalyticsEvent) C23872m0.parseWithIOException(PARSER, inputStream, a0Var);
        }

        public static AnalyticsEvent parseFrom(C23856l lVar) {
            return (AnalyticsEvent) C23872m0.parseWithIOException(PARSER, lVar);
        }

        public static AnalyticsEvent parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (AnalyticsEvent) C23872m0.parseWithIOException(PARSER, lVar, a0Var);
        }
    }

    /* renamed from: io.clipworks.analytics.ALS12$AnalyticsEventOrBuilder */
    public interface AnalyticsEventOrBuilder extends C23896m1 {
        boolean containsParams(String str);

        /* synthetic */ List<String> findInitializationErrors();

        /* synthetic */ Map<C24025t.C24035g, Object> getAllFields();

        /* synthetic */ C23836g1 getDefaultInstanceForType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ C24025t.C24027b getDescriptorForType();

        /* synthetic */ Object getField(C24025t.C24035g gVar);

        int getGlobalSeqNum();

        /* synthetic */ String getInitializationErrorString();

        int getLocalSeqNum();

        String getName();

        C16994k getNameBytes();

        /* synthetic */ C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar);

        @Deprecated
        Map<String, String> getParams();

        int getParamsCount();

        Map<String, String> getParamsMap();

        String getParamsOrDefault(String str, String str2);

        String getParamsOrThrow(String str);

        /* synthetic */ Object getRepeatedField(C24025t.C24035g gVar, int i);

        /* synthetic */ int getRepeatedFieldCount(C24025t.C24035g gVar);

        long getTime();

        long getTimestamp();

        /* synthetic */ C24020s2 getUnknownFields();

        /* synthetic */ boolean hasField(C24025t.C24035g gVar);

        /* synthetic */ boolean hasOneof(C24025t.C24042k kVar);

        /* synthetic */ boolean isInitialized();
    }

    static {
        C24025t.C24027b bVar = getDescriptor().mo38347g().get(0);
        internal_static_ALS12_AnalyticsEvent_descriptor = bVar;
        internal_static_ALS12_AnalyticsEvent_fieldAccessorTable = new C23872m0.C23880f(bVar, new String[]{"Time", "Timestamp", "Name", "Params", "GlobalSeqNum", "LocalSeqNum"});
        C24025t.C24027b bVar2 = bVar.mo38320i().get(0);
        internal_static_ALS12_AnalyticsEvent_ParamsEntry_descriptor = bVar2;
        f70232x42f80dc6 = new C23872m0.C23880f(bVar2, new String[]{"Key", "Value"});
    }

    private ALS12() {
    }

    public static C24025t.C24038h getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(C23806a0 a0Var) {
    }

    public static void registerAllExtensions(C24071y yVar) {
        registerAllExtensions((C23806a0) yVar);
    }
}
