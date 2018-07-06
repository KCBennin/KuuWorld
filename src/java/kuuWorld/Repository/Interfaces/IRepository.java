
package kuuWorld.Repository.Interfaces;

import java.util.List;


public interface IRepository<T> extends IReadOnlyRepository<T> {

    public void AddResource(T Entity);

    public void AddResourceRange(List<T> EntityRange);

    public void RemoveResource(Integer Id);

    public void RemoveResourceRange(List<T> EntityRange);
}
