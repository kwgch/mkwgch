package slim3.demo.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2012-07-16 10:53:31")
/** */
public final class BlogMeta extends org.slim3.datastore.ModelMeta<slim3.demo.model.Blog> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<slim3.demo.model.Blog> content = new org.slim3.datastore.StringAttributeMeta<slim3.demo.model.Blog>(this, "content", "content");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<slim3.demo.model.Blog, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<slim3.demo.model.Blog, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<slim3.demo.model.Blog> title = new org.slim3.datastore.StringAttributeMeta<slim3.demo.model.Blog>(this, "title", "title");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<slim3.demo.model.Blog, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<slim3.demo.model.Blog, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final BlogMeta slim3_singleton = new BlogMeta();

    /**
     * @return the singleton
     */
    public static BlogMeta get() {
       return slim3_singleton;
    }

    /** */
    public BlogMeta() {
        super("Blog", slim3.demo.model.Blog.class);
    }

    @Override
    public slim3.demo.model.Blog entityToModel(com.google.appengine.api.datastore.Entity entity) {
        slim3.demo.model.Blog model = new slim3.demo.model.Blog();
        model.setContent((java.lang.String) entity.getProperty("content"));
        model.setKey(entity.getKey());
        model.setTitle((java.lang.String) entity.getProperty("title"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        slim3.demo.model.Blog m = (slim3.demo.model.Blog) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("content", m.getContent());
        entity.setProperty("title", m.getTitle());
        entity.setProperty("version", m.getVersion());
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        slim3.demo.model.Blog m = (slim3.demo.model.Blog) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        slim3.demo.model.Blog m = (slim3.demo.model.Blog) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        slim3.demo.model.Blog m = (slim3.demo.model.Blog) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        slim3.demo.model.Blog m = (slim3.demo.model.Blog) model;
        long version = m.getVersion() != null ? m.getVersion().longValue() : 0L;
        m.setVersion(Long.valueOf(version + 1L));
    }

    @Override
    protected void prePut(Object model) {
    }

    @Override
    protected void postGet(Object model) {
    }

    @Override
    public String getSchemaVersionName() {
        return "slim3.schemaVersion";
    }

    @Override
    public String getClassHierarchyListName() {
        return "slim3.classHierarchyList";
    }

    @Override
    protected boolean isCipherProperty(String propertyName) {
        return false;
    }

    @Override
    protected void modelToJson(org.slim3.datastore.json.JsonWriter writer, java.lang.Object model, int maxDepth, int currentDepth) {
        slim3.demo.model.Blog m = (slim3.demo.model.Blog) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getContent() != null){
            writer.setNextPropertyName("content");
            encoder0.encode(writer, m.getContent());
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getTitle() != null){
            writer.setNextPropertyName("title");
            encoder0.encode(writer, m.getTitle());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected slim3.demo.model.Blog jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        slim3.demo.model.Blog m = new slim3.demo.model.Blog();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("content");
        m.setContent(decoder0.decode(reader, m.getContent()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("title");
        m.setTitle(decoder0.decode(reader, m.getTitle()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}