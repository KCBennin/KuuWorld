
package kuuWorld.Repository.Interfaces;

import java.util.List;


public interface IRepository<TEntity> extends IReadOnlyRepository<TEntity> {

    public void AddResource(TEntity Entity);

    public void AddResourceRange(List<TEntity> EntityRange);

    public void RemoveResource(Integer Id);

    public void RemoveResourceRange(List<TEntity> EntityRange);
}
